package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get the printWriter 
		PrintWriter pw = res.getWriter();
		//set content type
		res.setContentType("text/html");
		//read additional request param  value
		String val = req.getParameter("log");
		
		
		if(val.equalsIgnoreCase("Login"))
			pw.println("<h1 style='color:blue; text-align:center;'>Your detais is here clik me<a href='https://www.facebook.com/RakesSur93' >  CLICK ME   </a></h1>");
		else
			pw.println("<h2>Your are not eligble<a href='login.html'>HOME</a></h2>");
		
		
		
		
		pw.close();
		pw.println("<h1 style='color:green;text-align:center'><a href='Login.html'>HOME</a></h1>");
		
		}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	

}
