package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/factorialServlet")
public class factorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read the data coming from fact.jsp
		
		
		String number=request.getParameter("num");
		//we have to convert from string to int
		
		int num=Integer.parseInt(number);
		int fact=1;
		for(int i=1;i<=num;i++) {
			
			fact=fact*i; //fact=1*1=1  ----> fact=1*2;   --> fact=2*3;
		}
		
		System.out.println(fact);
		 //request.setAttribute("result", fact);  // ----> result= 6
		// request.getRequestDispatcher("fact.jsp").forward(request,response);
		 
		 //session scope
		// HttpSession session=request.getSession(false);
		 // please give me the existing session, if any .If any session is not existing,  create new session.
		
		 HttpSession session=request.getSession(false);
		// please give me the existing session, if any . Don't create new session, if there is no  any existing session
		
		 session.setAttribute("result", fact);
		 //request.getRequestDispatcher("fact.jsp").forward(request,response);
		 
		 //application scope
		 ServletContext applicationScope=getServletContext();    //for getting application scope
		 applicationScope.setAttribute("email", "chandra@gmail.com");
		 request.getRequestDispatcher("fact.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
