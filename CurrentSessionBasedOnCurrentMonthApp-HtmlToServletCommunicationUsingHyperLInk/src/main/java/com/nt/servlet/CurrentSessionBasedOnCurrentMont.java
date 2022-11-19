package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CurrentSessionBasedOnCurrentMont extends HttpServlet {
	//get service 2 method
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		//get pritnwirter
		PrintWriter pw = res.getWriter();
		//set content Type
		res.setContentType("text/html");
		//b.logic
		HttpSession instance=req.getSession();
		pw.println("<h1 style='color:blue;text-align:center'>"+instance+"</h1>");
		//close the stream
		pw.println("<br><a href='http://localhost:2525///CurrentSessionBasedOnCurrentMonthApp-HtmlToServletCommunicationUsingHyperLInk/Page.html' >"
				+ "<h2 style='color:blue;text-align:center;'>HOME</h2></a>");
		pw.close();
		

	}


}
