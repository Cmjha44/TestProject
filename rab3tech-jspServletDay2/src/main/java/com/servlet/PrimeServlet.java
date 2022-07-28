package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		static boolean isPrimenumber(int n) {
			if(n<=1) {
			return false;
			}
			for(int i=2;i<=n/2;i++) {         
				if((n%i)==0) {				
					return false;			
				}							
					
			}
			return true;//finally return true
		}   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("number");
		int numb=Integer.parseInt(num);
		boolean isPrime=isPrimenumber(numb);
		request.setAttribute("uinput", numb);
		request.setAttribute("answer", isPrime);
		 RequestDispatcher rd=request.getRequestDispatcher("primenumber.jsp");
		  rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
