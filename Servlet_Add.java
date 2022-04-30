package com.pack;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_Add")
public class Servlet_Add extends HttpServlet
{
	

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
     {
    	 int n1=Integer.parseInt(request.getParameter("t1"));
		 int n2=Integer.parseInt(request.getParameter("t2"));
		 int n3=Integer.parseInt(request.getParameter("t3"));
		 int sum= n1+n2+n2;
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 // Below code is to get value of sum in the Servlet_Mul.
		 
		 ServletContext conf = getServletContext();
		 conf.setAttribute("Addval",sum);
		 out.println("<h4><a href='Servlet_Mul'>Go To Mulptiplication</a></h4>");
		 
		 // Below Code is to Forwadr the value of sum to Servlet_Mul
//		 request.setAttribute("Addval", sum);
//		 RequestDispatcher rd = request.getRequestDispatcher("/Servlet_Mul");
//		 rd.forward(request, response);
     }

	
	

}
