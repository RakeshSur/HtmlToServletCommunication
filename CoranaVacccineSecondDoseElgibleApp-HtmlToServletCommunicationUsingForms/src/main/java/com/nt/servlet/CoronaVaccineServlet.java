package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CoronaVaccineServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get print Writer stream from res object
				PrintWriter pw = res.getWriter();
				//set response content type
				res.setContentType("text/html");
				//read from data as request param value
				String name = req.getParameter("pname");
				String tage = req.getParameter("page");
				int age = Integer.parseInt(tage);
				String addrs = req.getParameter("paddress");
				String mail = req.getParameter("pmail");
				String center = req.getParameter("vcenter");
				String cond = req.getParameter("cond");
				//invoke businnes logic
				
				if(age>18)
					pw.println("<h1 style='color:blue;text-align:center'>Ms/Mrs."+name+"<br> adress is: "+addrs+"<br>age is: "+age+"<br>center is:"+center+"<br>mail id is"+mail+"+</h1>");
				else
					pw.println("<h1 style='color:blue;text-align:center'>Ms/Mrs."+name+" of "+addrs+" u are not elgible for vaccine </h1>");
				//add home hyper link(graphical link)
				pw.println("<a style='color:red;text-align:center' href='corona.html'><h2>Click here to Go Back</h2></a>");
				
				
	}

}
