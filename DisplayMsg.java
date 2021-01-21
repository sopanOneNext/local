package com.phonon.asses;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayMsg")
public class DisplayMsg extends HttpServlet
{
	
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println(" servlet get inialized ");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String age=request.getParameter("age");
		
		PrintWriter pw=response.getWriter();
		pw.print(fname+" ");
		pw.print(lname+" ");
		pw.print(age); 
	}

}
