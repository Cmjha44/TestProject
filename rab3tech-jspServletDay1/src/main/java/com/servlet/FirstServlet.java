package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
//every servlet should have unique name
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request will capture data from client
		//request is blank
		response.setContentType("text/html");
		System.out.println("Hello");  // here ar able to print something on console
		PrintWriter pw=response.getWriter();
		//PrintWriter--print text data to character stream
		//getWriter()---Returns a PrintWriter object that can send character text to the client
		//It is going to work like /pen to write something on browser
		
		//Writing data inside response body
		
		pw.println("Hello .....dear friends how are you???");
		pw.println("<h1> Subha.....Bickey....Chandra...Hasina...Kushal..   </h1>");
		pw.println("<h3>    Good morning every one...          </h3>");
		pw.println("<h2>    Good night...          </h2>");
		pw.println("<a href=\'first.html\'>Click here to execute first html</a>");
		
		
		pw.println("<br>");
		pw.println("<a href=\'second.html\'>Click here to execute second html</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
