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

public class Login extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Hello Dear "+name+" You Have Succefully login");
		out.println("<a href='Welcome'>Click here to be continue</a>");
		out.println("</hr>");
		
		ServletConfig conf = getServletConfig();
		ServletContext c = getServletContext();
		String val1 = c.getInitParameter("UserName");
		String val = conf.getInitParameter("Developer");
		
//		String val = conf.getInitParameter("Developer");
		
		out.println("<h4 style = 'text-align:right;font-style:italic'>Develpoed By "+val1+"</h4>");
	}

}
