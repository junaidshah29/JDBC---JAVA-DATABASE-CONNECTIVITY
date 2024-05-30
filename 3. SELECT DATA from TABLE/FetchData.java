

import java.sql.*;

public class FetchData{
	public static void main(String[] args){
		try{
			// LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE AND GET CONNECTION
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empinfo", "root", "junaid");

			// WRITE "SELECT" SQL QUERY...
			String query = "select * from employee";

			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()){
				String eid1 = rs.getString("eId");
				System.out.println(eid1);

				String name1 = rs.getString("eName");
				System.out.println(name1);

				String city1 = rs.getString("eCity");
				System.out.println(city1);
			} 

			con.close();

		}catch(Exception e){
			System.out.println("Error...");
		}
	}
}