package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
static int facto(int input) {
    	
    	int num=1;
    	for (int i=1; i<=input;i++) {
    		num=num*i;
    		
    	}
    	return num;
    	
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String st=request.getParameter("textinput");
		int number=Integer.parseInt(st);
		int result=facto(number);
		
		request.setAttribute("answer", result);
		 RequestDispatcher rd=request.getRequestDispatcher("FactoResult.jsp");
		  rd.forward(request, response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
