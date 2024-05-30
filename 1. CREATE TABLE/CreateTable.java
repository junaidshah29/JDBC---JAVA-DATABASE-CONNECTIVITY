// CREATE TABLE

// IMPORT PACKAGES OF SQL
import java.sql.*;

public class CreateTable{
	public static void main(String[] args) {
		try{
			// LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE THE CONNECTION
			String url = "jdbc:mysql://localhost:3306/empinfo";
			String root = "root";
			String password = "junaid";

			// GET CONNECTION
			Connection con = DriverManager.getConnection(url, root, password);

			// WRITE SQL QUERY for CREATING TABLE
			String query = "create table employee(eId int primary key auto_increment, eName varchar(30) not null, eCity varchar(30))";

			// CREATE STATEMENT
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);

			// print message
			System.out.println("Table is Created Successfully...");

			con.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}