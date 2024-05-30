/*
	INSERTING DATA INTO TABLE USING "PreparedStatement".
	This is also known as Static Input.
*/

// import packages of SQL
import java.sql.*;

public class StaticInput{
	public static void main(String[] args) {
		try{
			// LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE CONNECTION
			String url = "jdbc:mysql://localhost:3306/empinfo";
			String username = "root";
			String password = "junaid";

			// GET CONNECTION
			Connection con = DriverManager.getConnection(url, username, password);

			// WRITE SQL QUERY FOR INSERTING VALUES
			String query = "insert into employee(ename, ecity) values (?, ?)"; //eId is auto_increment ie not written/mentioned in query.
			// GET THE "PreparedStatement" OBJECT...
			PreparedStatement pstmt = con.prepareStatement(query);

			//SET THE VALUES TO QUERY...
			pstmt.setString(1, "Junaid");
			pstmt.setString(2, "Jalgaon"); 

			pstmt.executeUpdate();
			System.out.println("Values are inserted Successfully...");

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}