package com.pack;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_Mul")
public class Servlet_Mul extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int n1=Integer.parseInt(request.getParameter("t1"));
//		 int n2=Integer.parseInt(request.getParameter("t2"));
//		 int n3=Integer.parseInt(request.getParameter("t3"));
//		 int mul= n1*n2*n2;
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 ServletContext c = getServletContext();
//		 out.println(c.getAttribute("Addval"));
		 
		 // Get Attribute from request object.
		 
//		 int s = (int)request.getAttribute("Addval");
		 out.println("<h3> Sum:- "+c.getAttribute("Addval")+"</h3>");
		 out.println("<a href='Welcome'>Servlet3</a>");
//		 out.println("<h3> sum:- "+s);
//		 out.println("<h3> Multiplication:- "+mul+"<h3>");
	}

	}


