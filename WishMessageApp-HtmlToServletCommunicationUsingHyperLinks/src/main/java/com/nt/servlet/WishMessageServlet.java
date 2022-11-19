package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishMessageServlet extends HttpServlet {
	// second service method protected service(-,-) method is overridden

		public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
			//get printWriter res object pointing to res object
			PrintWriter pw = res.getWriter();
			//set response content type
			res.setContentType("text/html");
			//write the b.logic to generate the wishMessage
			
			//get the system DateAndTime
			LocalDateTime ltd = LocalDateTime.now();
			int hour = ltd.getHour();
			
			
			//generate the wishMessage
			String mssg = null;
			
			if(hour<12)
				mssg="Good Morning";
			else if(hour<16)
				mssg="Good AfterNoon";
			else if(hour<20)
				mssg="Good Evening";
			else
				mssg="Good Night";
			//Display the generated message
			pw.println("<h1 style='color:green; text-align:center'>"+mssg+"</h1>");
			
			
			Date d = new Date();
			pw.println("<br><br><h3 style='color:brown;text-align:center'>"+d+"</h3>");
			res.setHeader("refresh", "5");
			//add home hyper link
					pw.println("<br><a href='http://localhost:2525///WishMessageApp-HtmlToServletCommunicationUsingHyperLinks/Page.html' >"
							+ "<h2 style='color:blue;text-align:center;'>HOME</h2></a>");
			
			//close the stream
			pw.close();
			

			
		}//service

}
