
import java.sql.*;

public class DeleteData {

	public static void main(String[] args){
		try{
			// LOAD THE DRIVER
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/empinfo";
		String username = "root";
		String password = "junaid";

		Connection c = DriverManager.getConnection(url, username, password);

		String query = "delete from employee where eId = 4";		
		
		
		Statement st = c.createStatement();
		
		int res = st.executeUpdate(query);
		if(res==1)
			System.out.println("Deleted");
		else
			System.out.println("Not Deleted");
		
		c.close();


		}catch(Exception e){
			System.out.println("Error...try again...");
		}
	}
}
 