package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data from browser(loginpage.jsp) --- data coming from client side
				String email=request.getParameter("email");
				String pass=request.getParameter("pswd");
				
				
				try {
					//1.Load/register driver class
					Class.forName("com.mysql.jdbc.Driver");
				
					try {
						//2.Create a connection
						Connection	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Root@1234");
						
						//3.create a statement
						PreparedStatement ps=conn.prepareStatement("select * from userlogin where email=? and password=?");
						ps.setString(1,email);  
						ps.setString(2,pass);  
						
						//4. execute query
						ResultSet rs=ps.executeQuery();
						if(rs.next()) {
							String eemail=rs.getString(1);
							String pword=rs.getString(2);
							String namee=rs.getString(3);
							String country=rs.getString(4);
						
							
							
							request.setAttribute("email",eemail);
							request.setAttribute("password",pword);
							request.setAttribute("name",namee);
							request.setAttribute("country",country);
							
							request.getRequestDispatcher("congratulation1.jsp").forward(request,response);
							
						}
						else {

							request.setAttribute("msg","Re-try...login again!!!");
							request.getRequestDispatcher("loginpage.jsp").forward(request,response);
						}
						
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
