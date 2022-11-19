package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCapitalServlet extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get print writer stream
	PrintWriter pw = res.getWriter();
	//set content type
	res.setContentType("text/html");
	//read from data
	int countryIndex = Integer.parseInt(req.getParameter("country"));
	String countries[] = new String[]{"New Delhi","IslamaBad","Colombo","Dhaka","New WasingTon DC"};
	pw.println("<h1 style='color:green;text-align:center'>The Cpital nmae is:: "+countries[countryIndex]+"</h1>");
	//add home hyper link
    pw.println("<h1 style='color:brown;text-align:center'><a href='input.html'>HOME</a></h1>");
    
    
    pw.close();
	
	
	}

}
