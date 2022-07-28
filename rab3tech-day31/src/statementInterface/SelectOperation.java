package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperation {
	
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
				/*
				PreparedStatement ps=conn.prepareStatement("select * from employee where id=?");
				ps.setInt(1,2);     //  ?=4
				*/
				
				Statement st=conn.createStatement();
				String sql="select * from employee where id=2";
				
						
				//4. execute query
				ResultSet rs=st.executeQuery(sql); //it returns ResultSet
			 
			while (rs.next()) {
			//System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getString("country")+"   "+rs.getString("emaiId"));	
			
			System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
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