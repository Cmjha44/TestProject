package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrievalOperation {
	// it is kept outside the main method to make it global and could be accessed
	// anywhere in program
	// it is made static so that I do not need to create object of it
	static String dbURL = "jdbc:mysql://localhost:3306/employeedb";
	static String username = "root";
	static String password = "Root@1234";
	static Connection conn = null;

	public static void main(String[] args) {

		try {
			// Load/register driver class
			Class.forName("com.mysql.jdbc.Driver");

			try {
				// Create a connection
				conn = DriverManager.getConnection(dbURL, username, password);
				// create a statement
				// there are two interface we can use i.e. PreparedStatement and Statement
				PreparedStatement ps = conn.prepareStatement("select * from employee where id=?");// here inside the
																									// prepareStatement
																									// parameter we give
																									// the sql query
				ps.setInt(1, 2); // ?=2

				// execute query
				// executeQuery() ---> only for select operation(It returns ResultSet)

				// executeUpdate()---> for all operations(insert,delete,update,etc) except
				// select operation
				// executeUpdate()--->it returns int type value

				ResultSet rs = ps.executeQuery(); // it returns ResultSet

				while (rs.next()) {
					// System.out.println(rs.getInt("id")+" "+rs.getString("name")+"
					// "+rs.getString("country")+" "+rs.getString("emaiId"));

					System.out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			try {
				// close the connection
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	}

}