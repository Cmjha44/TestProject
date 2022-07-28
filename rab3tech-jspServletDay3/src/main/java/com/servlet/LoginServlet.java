package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//business logic
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if ("chandra".equals(name) && "333".equals(pass)) {
			//true 
			//RequestDispatcher rd=request.getRequestDispatcher("congrats.html");
			//rd.forward(request,response);
			
			request.getRequestDispatcher("congrats.html").forward(request,response);;
		
		}else {
			//false
			request.setAttribute("message","Invalid user...Try to login again");
			
			//RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			//rd.forward(request,response);
			request.getRequestDispatcher("login.jsp").forward(request,response); //within a server
			
			
			//response.sendRedirect("https://www.google.com/"); //different server
			//response.sendRedirect("test.jsp"); //within server
			// it may work on same as we as on different server also
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
