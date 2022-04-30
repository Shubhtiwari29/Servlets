package com.pack;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;
import java.util.*;


public class CheckServer extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType ("text/html");
		PrintWriter out = response.getWriter();
		Date d = new Date();
		out.println("Today's date is "+d);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType ("text/html");
		PrintWriter out = response.getWriter();
		//PrintWriter = response.getWriter();
		String[] h = request.getParameterValues("hobby");
		Date d = new Date();
//		out.println("Today's date is "+d);
		out.println("Your hobbies are:-");
		for (int i=0;i<h.length;i++)
		{
			out.println(h[i]);
			out.println();
		}
			out.println();
		out.println("Today's date is "+d);
		
		
	
		// An Alternet for each method for Above For Loop
//		for(String n : h)
//		{
//			out.print(n);
//		}
		
		
	}

}
