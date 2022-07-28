package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertOperation {
	
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
				PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");
				ps.setInt(1,5);  
				ps.setString(2,"Seema");
				ps.setString(3,"India");
				ps.setString(4,"seema@gmail.com");
				
				//4. execute query
						
				//executeUpdate()---> for all operations(insert,delete,update,etc) except select operation
			int x=ps.executeUpdate(); //it returns int value
			
			
			if (x>0) {
				 System.out.println("No of record inserted ="+x);
				 System.out.println("Record inserted successfully");
			 }
			 else {
				 System.out.println("No of record inserted ="+x);
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