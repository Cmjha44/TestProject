package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data which is coming from client side
				String num1=request.getParameter("fnum");
				String num2=request.getParameter("lnum");
				
				//converting String type of data into Int type
				
				int x=Integer.parseInt(num1);
				int y=Integer.parseInt(num2);
				int sum=x+y;
				
				System.out.println(sum);
				
				request.setAttribute("solution", sum);
		  
		  
		  RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		  rd.forward(request, response);
			
		  
		  //by using requestDispatcher class we are able to forward the response to the client in the form of 
		  //(jsp/html/angular/typescript/servlet)
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
