package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AirthmeticServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWirter 
		PrintWriter pw = res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read additional request param  value
		String s1Val = req.getParameter("s1");
		//read text box value and convert them into float value when submit button clicked
		float val1 = 0.0f,val2=0.0f;
		if(!s1Val.equalsIgnoreCase("link1") && !s1Val.equalsIgnoreCase("link2")) {
			val1=Float.parseFloat(req.getParameter("t1"));
			val2=Float.parseFloat(req.getParameter("t2"));
			
		}
		//get system Date and Time
		LocalDateTime ltd = LocalDateTime.now();
		//differntiate the logic of multiple submit button and hyper link
		if(s1Val.equalsIgnoreCase("add")) {
			pw.println("<h1 style='color:pink;text-align:center'>Addition :: "+(val1+val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("sub")) {
			pw.println("<h1 style='color:blue;text-align:center'>Substraction :: "+(val1-val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("mul")) {
			pw.println("<h1 style='color:black;text-align:center'>Multiple :: "+(val1*val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("div")) {
			pw.println("<h1 style='color:pink;text-align:center'>Division :: "+(val1/val2)+"</h1>");
		}
		else if(s1Val.equalsIgnoreCase("link1")){
			int hour = ltd.getHour();
			if(hour<12) 
				pw.println("<h1 style='color:red;text-align:center'>Good Morning</h1>");
			else if(hour<16) 
				pw.println("<h1 style='color:red;text-align:center'>Good AfterNoon</h1>");
			else if(hour<20) 
				pw.println("<h1 style='color:red;text-align:center'>Good Evenging</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center'>Good Night</h1>");
		}
		else {
			//get current month 
			int month = ltd.getMonthValue();
			if (month >= 3 && month <= 6)
				pw.println("<h1 style='color:green;text-align:center'>Summer Season</h1>");
			else if (month >= 7 && month <= 10)
				pw.println("<h1 style='color:Red;text-align:center'>Rainy Season</h1>");
			else
				pw.println("<h1 style='color:green;text-align:center'>Winter Season</h1>");
			
			
		
			
		}
		pw.println("<h1 style='color:green;text-align:center'><a href='input.html'>HOME</a></h1>");
		pw.close();
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
