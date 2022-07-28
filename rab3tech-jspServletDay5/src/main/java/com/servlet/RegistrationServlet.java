package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data which are coming from client side through registration.jsp
		
		String email=request.getParameter("email");
		String pass=request.getParameter("pswd");
		String name=request.getParameter("name");
		String country=request.getParameter("country");
		Connection conn=null;
		//business logic
		
		
		try {
			//1.Register/Loaf the driver class
			Class.forName("com.mysql.jdbc.Driver");
			try {
				//2. Creating a connection
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Root@1234");
				//3. Create statement
				PreparedStatement ps=conn.prepareStatement("insert into userlogin values(?,?,?,?)");
				 
				 ps.setString(1,email); 
				 ps.setString(2,pass); 
				 ps.setString(3,name);     
				 ps.setString(4,country); 
				 
				//4. execute Query
					int noOfInsertedRecord =ps.executeUpdate();  //it will return int value
					
					if(noOfInsertedRecord>0) {
						//System.out.println("Record inserted successfully");
						
						userDTO userDTO=new userDTO(email,pass,name,country);
						
						request.setAttribute("userDTO",userDTO);
						request.setAttribute("msg","Record inserted successfully");
				request.getRequestDispatcher("congratulation2.jsp").forward(request,response);
					
					}else {
						request.setAttribute("msg","Record not inserted");
						System.out.println("Record not inserted ");
					}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
