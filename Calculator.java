package com.pack;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
 public class Calculator extends HttpServlet
 {
	 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	 {
		
		 res.setContentType("text/html");
		 PrintWriter out = res.getWriter();
		 
		 int sum=0,sub=0,mul=0;
		 float div=0;
		 int n1=Integer.parseInt(req.getParameter("t1"));
		 int n2=Integer.parseInt(req.getParameter("t2"));
		 String opr = req.getParameter("opr");
		 
		 if(opr.equalsIgnoreCase("add"))
		 {
			 sum=n1+n2;
			 out.println(sum);
			 RequestDispatcher rd = req.getRequestDispatcher("Cal.html");
				rd.include(req, res);
			 
		 }
		 else if(opr.equalsIgnoreCase("sub"))
		 {
			 sub = n1-n2;
			 out.println(sub);
			 RequestDispatcher rd = req.getRequestDispatcher("Cal.html");
				rd.include(req, res);
			 		 }
		 else if(opr.equalsIgnoreCase("mul"))
		 {
			  mul = n1*n2;
			 out.println(mul);
			 RequestDispatcher rd = req.getRequestDispatcher("Cal.html");
				rd.include(req, res);
			 
		 }
		 else if(opr.equalsIgnoreCase("div"))
		 {
			  div = n1/n2;
			 out.println(div);
			 RequestDispatcher rd = req.getRequestDispatcher("Cal.html");
				rd.include(req, res);
			 
		 }
		 else
		 {
			 out.print("Invalid input");
			 RequestDispatcher rd = req.getRequestDispatcher("Cal.html");
				rd.include(req, res);
			 
	     }
	}
 }
