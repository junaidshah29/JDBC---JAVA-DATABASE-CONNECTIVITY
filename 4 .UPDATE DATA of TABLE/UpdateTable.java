
// IMPORT JAVA and SQL PACKAGES
import java.util.*;
import java.sql.*;


public class UpdateTable{
	public static void main(String[] args) {
		try{
			// LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE CONNECTION and GET CONNECTION
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empinfo","root", "junaid");

			// WRITE "UPDATE" SQL QUERY...
			String query = "update employee set eName=?, eCity=? where eId=? ";

			// GETTING THIS VALUE FROM USER SO WE USED HERE SCANNER...
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter New Name: ");
			String name = sc.nextLine();

			System.out.print("Enter new City: ");
			String city = sc.nextLine();

			System.out.println("Enter the Employee Id where do you want to update: ");
			int id = Integer.parseInt(sc.nextLine());


			// get PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);

			// setting the values
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);

			pstmt.executeUpdate();

			System.out.println("Your Data Updated Successfully...");
			con.close();

		}catch(Exception e){
			System.out.println("Error!...");
		}
	}
}