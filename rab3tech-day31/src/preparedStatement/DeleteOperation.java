package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteOperation {
	
	static String dbURL="jdbc:mysql://localhost:3306/employeedb";
	static String username="root";
	static String password="Root@1234"; 
	static Connection conn=null;
	
	
	
	public static void main(String[] args) {
		
		
		
		try {
			//1.Load/register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			
			 try {
				//2. Create a connection
				conn=DriverManager.getConnection(dbURL,username,password);
				
				//3. create a statement
				PreparedStatement ps=conn.prepareStatement("delete from employee where id=?");
						 
				    ps.setInt(1,5);
				
			   //4. execute query
						
				//executeUpdate()---> for all operations(insert,delete,update,etc) except select operation
			int x=ps.executeUpdate(); //it returns int value
			
			
			if (x>0) {
				 System.out.println("Number of deleted record(s) ="+x);
				 System.out.println("Record deleted successfully");
			 }
			 else {
				 
				 System.out.println("Record not deleted");
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
				//5. close the connection
					conn.close();
						} catch (SQLException e) {
			
			e.printStackTrace();
							}
		
		}
	}

}