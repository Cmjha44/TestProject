package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveAllRecords {
	
	static String dbURL="jdbc:mysql://localhost:3306/employeedb";
	static String username="root";
	static String password="Root@1234"; 
	static Connection conn=null;
	
	
	
	public static void main(String[] args) {
		
		
		
		try {
			//1. Load/register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 try {
				//2. Create a connection
				conn=DriverManager.getConnection(dbURL,username,password);
				
				//3. Create a statement
				PreparedStatement ps=conn.prepareStatement("select * from employee");
				
				
				//4. Execute query
			
			ResultSet rs=ps.executeQuery(); //it returns instance of ResultSet
			 
			while (rs.next()) {
			//System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getString("country")+"   "+rs.getString("emaiId"));	
			
			System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4));
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
				//close the connection
					conn.close();
						} catch (SQLException e) {
			
			e.printStackTrace();
							}
		
		}
	}

}