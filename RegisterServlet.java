package com.pack;

import  java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		String name =req.getParameter("uname");
		String pass = req.getParameter("password");
		String email = req.getParameter("email");
		String Gender = req.getParameter("gen");
		String course = req.getParameter("course");
		String cond =req.getParameter("condition");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		if(cond.equals("checked"))
		{
			out.println("<h2>Nmae:- "+name);
			out.println("<h2>Nmae:- "+pass);
			out.println("<h2>Nmae:- "+email);
			out.println("<h2>Nmae:- "+Gender);
			out.println("<h2>Nmae:- "+course);	
			RequestDispatcher rd = req.getRequestDispatcher("");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("form.html");
			out.println("<h4> You have not accpted all the terms and conditions</h4>//");
		}
			
	}
}

