package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AllFormCompsServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get pritnWriter
		PrintWriter pw = res.getWriter();
		// set content type
		res.setContentType("text/html");
		// read form data
		String name = req.getParameter("cname");
		int age = Integer.parseInt(req.getParameter("cage"));
		String addrs = req.getParameter("cadds");
		String gen = req.getParameter("gender");
		String ms = req.getParameter("ms");

		if (ms == null)
			ms = "single";

		String qlfy = req.getParameter("qlfy");
		if (qlfy == null)
			qlfy = "NO qulification is selected";// handling non check state for multiple check box
		String hobies[] = req.getParameterValues("hb");
		if (hobies == null)
			hobies = new String[] { "NO Hobies is selected" };

		String cusin[] = req.getParameterValues("favCousine");
		if (cusin == null)
			cusin = new String[] { "NO fav cusin  is selected" };
		String color = req.getParameter("favcolor");
		int lnumber = Integer.parseInt(req.getParameter("luckynumber"));
		int salary = Integer.parseInt(req.getParameter("salary"));
		String email = req.getParameter("mail");
		String dob = req.getParameter("dob");
		String tob = req.getParameter("tob");
		String doj = req.getParameter("doj");
		long mobno = Long.parseLong(req.getParameter("mob"));
		String emonth = req.getParameter("eMonth");
		String favWeek = req.getParameter("favWeek");
		String fburl = req.getParameter("fbUrl");
		String string = req.getParameter("sString");

		// write b.logic
		if (gen.equalsIgnoreCase("male")) {
			if (age < 5)
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are baby boy</h1>");
			else if (age <= 12)
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are a teen age boy</h1>");
			else if (age <= 20)
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are a Young age boy</h1>");
			else if (age <= 50)
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are a old aged person</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are a old </h1>");
		} else {
			if (age < 5)
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are baby girl</h1>");
			else if (age <= 12)
				pw.println("<h1 style='color:red;text-align:center'>MR. " + name + " Your are a teen age girl</h1>");
			else if (age >= 30)
				if (ms.equalsIgnoreCase("maried"))
					pw.println("<h1 style='color:red;text-align:center'>MR. " + name
							+ " Your are a Youngmarried girl</h1>");
				else
					pw.println("<h1 style='color:red;text-align:center'>MR. " + name
							+ " Your are a young un maried girl</h1>");

		}
		
		//display from form data
		pw.println("<h1 styel='color:blue'>Form data is </h1>");
		pw.println("<h2>Name is "+name+" </h2><br><br>");
		pw.println("<h2>Age is "+age+" </h2><br><br>");
		pw.println("<h2>Adress is "+addrs+" </h2><br><br>");
		pw.println("<h2>Gender is "+gen+" </h2><br><br>");
		pw.println("<h2>Maritail statu is  "+ms+" </h2><br><br>");
		pw.println("<h2>Mob NO is "+mobno+" </h2><br><br>");
		pw.println("<h2>Date of birth is "+dob+" </h2><br><br>");
		pw.println("<h2>Date of joining is "+doj+" </h2><br><br>");
		pw.println("<h2>Time of birth is "+tob+" </h2><br><br>");
		pw.println("<h2>Salary is "+salary+" </h2><br><br>");
		pw.println("<h2>Fav color is "+color+" </h2><br><br>");
		pw.println("<h2>FavdayOfWeek is "+favWeek+" </h2><br><br>");
		pw.println("<h2>Algertic mont is "+emonth+" </h2><br><br>");
		pw.println("<h2>Hobies  are "+Arrays.asList(hobies)+" </h2><br><br>");
		pw.println("<h2>Fav cusin are "+Arrays.asList(cusin)+" </h2><br><br>");
		pw.println("<h2>Qulification is "+qlfy+" </h2><br><br>");
		pw.println("<h2>Name is "+name+" </h2><br><br>");
		pw.println("<h2>Email is "+email+" </h2><br><br>");
		pw.println("<h2>FB url is "+fburl+" </h2><br><br>");
		pw.println("<h2>Google search Stirng is "+string+" </h2><br><br>");
		
		//add home hyperlink
		pw.println("<a href='form.html>HOME</a>");
		
        pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
	

}
