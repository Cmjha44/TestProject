package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetAllRecord")
public class GetAllRecord<UserDTO> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		try {
			//1.Load/register driver class
			Class.forName("com.mysql.jdbc.Driver");
		
			try {
				//2.Create a connection
				Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Root@1234");
				
				//3.create a statement
				PreparedStatement ps=conn.prepareStatement("select * from userlogin");
				
				//4. execute query
				ResultSet rs=ps.executeQuery();
				
				List<userDTO> userList=new ArrayList<>();
				
			//if u want to print the record on console
				while(rs.next()) {
					String email=rs.getString(1);
					String password=rs.getString(2);
					String name=rs.getString(3);
					String country=rs.getString(4);
					//String ssn=rs.getString(5);
					
					
					//request.setAttribute("username",username);
					//request.setAttribute("password",password);
					//request.setAttribute("name",name);
					//request.setAttribute("email",email);
					//request.setAttribute("ssn",ssn);
					
					userDTO userDTO=new userDTO(email, password,name,country);
					//userDTO is an object which is holding one records values at a time
					userList.add(userDTO);
					
				}
				
				request.setAttribute("userList",userList);
				request.getRequestDispatcher("allusers.jsp").forward(request,response);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
