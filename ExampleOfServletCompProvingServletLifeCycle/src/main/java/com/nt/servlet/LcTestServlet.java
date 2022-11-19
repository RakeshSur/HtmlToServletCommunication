package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LcTestServlet extends HttpServlet {
	static {
		System.out.println("LcTestServlet:: static block");
	}
	public LcTestServlet() {
		System.out.println("LcTestServlet:: 0 param constructor");
	}
	public void init(ServletConfig cg) {
		System.out.println("LcTestServlet.init() - method");
	}
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		System.out.println("LcTestServlet.service()");
		System.out.println(res.hashCode());
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		//b.logic
		
		Date d = new Date();
		pw.println("<h1 style='color:green;text-align:center'> Date is "+d+" </h1>");
		//close the stream
		pw.close();
				
	}
	public void service1(HttpServletRequest req,HttpServletResponse res1) throws ServletException, IOException{
		System.out.println("LcTestServlet.service()");
		System.out.println(res1.hashCode());
		
		PrintWriter pw = res1.getWriter();
		
		res1.setContentType("text/html");
		
		//b.logic
		
		Date d = new Date();
		pw.println("<h1 style='color:green;text-align:center'> Date is "+d+" </h1>");
		//close the stream
		pw.close();
				
	}
	
	
	@Override
	public void destroy() {
		
		System.out.println("LcTestServlet.destroy()");
	}
	

}
