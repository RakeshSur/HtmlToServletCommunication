package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LinksServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get printWriter obj
		PrintWriter pw = res.getWriter();
		// set content type
		res.setContentType("text/html");
		// read additional req param value
		String p1Val = req.getParameter("p1");
		Locale locales[] = Locale.getAvailableLocales();

		// write the request processing logic
		if (p1Val.equalsIgnoreCase("link1")) {
			Set<String> langset = new HashSet();
			for (Locale l : locales) {
				langset.add(l.getDisplayLanguage());
			}
				pw.println("<h1 style='color:bule;text-align:center'>All Languages are</h1>");
				langset.forEach(lang -> pw.println(lang + ","));
				pw.println("<h1 style='color:green;text-align:center'><a href='links.html'>HOME</a></h1>");

			
		} else if (p1Val.equalsIgnoreCase("link2")) {
			Set<String> countrySet = new HashSet();
			
			for (Locale l : locales) {
				
				countrySet.add(l.getDisplayCountry());
			}
				pw.println("<h1 style='color:green;text-align:center'>All Countries are</h1>");
				countrySet.forEach(country -> pw.println(country + ","));
				pw.println("<h1 style='color:green;text-align:center'><a href='links.html'>HOME</a></h1>");
			
		} else {
			// local date
			LocalDateTime ltd = LocalDateTime.now();

			// get current month
			int month = ltd.getMonthValue();

			if (month >= 3 && month <= 6)
				pw.println("<h1 style='color:green;text-align:center'>Summer Season</h1>");
			else if (month >= 7 && month <= 10)
				pw.println("<h1 style='color:Red;text-align:center'>Rainy Season</h1>");
			else
				pw.println("<h1 style='color:green;text-align:center'>Winter Season</h1>");
			
			//
			pw.println("<h1 style='color:green;text-align:center'><a href='links.html'>HOME</a></h1>");
			pw.close();

		}

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
