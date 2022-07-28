package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
	
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
				
				
				//3. create a statement
				
				
				Statement st=conn.createStatement();
				String sql="insert into employee values(7,'Seema','India','seema@gmail.com')";
				
						
				//4. execute query
				int i=st.executeUpdate(sql); //it returns int type value
			 
			if (i>0) {
					System.out.println("Record inserted successfully");
			}
			else {
				System.out.println("Record not inserted");
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