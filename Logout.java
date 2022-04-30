package com.pack;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;

public class Logout extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.print("Dear user, You have succefully logout");
	out.print("<a href='Form1.html'>Click Here to go to HomePage</a>");
	
	ServletConfig conf = getServletConfig();
	ServletContext c = getServletContext();
	String val1 = c.getInitParameter("UserName");
	String val = conf.getInitParameter("Developer");

//	String val = conf.getInitParameter("Developer");
	
	out.println("<h4 style = 'text-align:right;font-style:italic'>Develpoed By "+val1+"</h4>");
	}


}
