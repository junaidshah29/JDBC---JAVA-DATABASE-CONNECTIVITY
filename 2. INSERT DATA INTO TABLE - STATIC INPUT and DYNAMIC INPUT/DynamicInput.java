/*
	INSERTING DATA INTO TABLE FROM TAKING USER INPUT --> "DYNAMIC INPUT" 
*/

// IMPORT JAVA AND SQL PACKAGES
import java.util.*;
import java.sql.*;

public class DynamicInput{
	public static void main(String[] args) {
		try{
			// LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE THE CONNECTION
			String url = "jdbc:mysql://localhost:3306/empinfo";
			String username = "root";
			String password = "junaid";

			// GET CONNECTION
			Connection con = DriverManager.getConnection(url, username, password);

			// WRITE SQL QUERY FOR INSERTING VALUES
			String query = "insert into employee(ename, ecity) values (?, ?)";//eId is auto_increment ie not written/mentioned in query.

			//GET "PreapredStatement" obejct...
			PreparedStatement pstmt = con.prepareStatement(query);

			// CREATE Scanner and it's Object...
			Scanner sc = new Scanner(System.in);

			// CREATE STATEMENT for name & city AND INITIALISE...
			System.out.print("Enter Employee Name: \n");
			String name = sc.nextLine();

			System.out.print("Enter Employee City: ");
			String city = sc.nextLine();

			// SET THE VALUES OF QUERY
			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();

			System.out.println("Data is Entered Successfully...");

			con.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}