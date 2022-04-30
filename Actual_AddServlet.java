package com.pack;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Actual_AddServlet")
public class Actual_AddServlet extends HttpServlet 
{
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    		response.setContentType("test/html");
    		PrintWriter out = response.getWriter();
    		ServletContext c = getServletContext();
//   		 	out.println(c.getAttribute("Addval"));
   		 	out.println(" Sum:- "+c.getAttribute("Addval"));
	}

}
