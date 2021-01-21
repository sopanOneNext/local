package com.phonon.servlet1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet 
{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("username");
		String resp=request.getParameter("responce");
		
		if(resp.equals("go")) {
			String respo="http://localhost:9091/TwoSevlet/SecondServlet";
				URL url = new URL(respo); 
			    HttpURLConnection connection = (HttpURLConnection) url.openConnection();           
			    connection.setDoOutput(true); 
			    connection.setInstanceFollowRedirects(false); 
			    connection.setRequestMethod("GET"); 
			    connection.setRequestProperty("Content-Type", "text/plain"); 
			    connection.setRequestProperty("charset", "utf-8");
			    connection.connect();
			RequestDispatcher rd=request.getRequestDispatcher("/SecondServlet");
			rd.include(request, response);
		}
		else if(resp.equals("forward")) {
			String respo="http://localhost:9091/TwoSevlet/SecondServlet";
			URL url = new URL(respo); 
		    HttpURLConnection connection = (HttpURLConnection) url.openConnection();           
		    connection.setDoOutput(true); 
		    connection.setInstanceFollowRedirects(false); 
		    connection.setRequestMethod("POST"); 
		    connection.setRequestProperty("Content-Type", "text/plain"); 
		    connection.setRequestProperty("charset", "utf-8");
		    connection.connect();
			RequestDispatcher rd=request.getRequestDispatcher("/SecondServlet");
			rd.include(request, response);
		}
	
		
	}

}
