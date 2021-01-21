package com.phonon.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phenon.peson.Person;
import com.phenon.session.Session;


@WebServlet("/registerlink")
public class Controller extends HttpServlet {

	Session ses=new Session();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fName=request.getParameter("firstname");
		String lName=request.getParameter("lastname");
		String pAge=request.getParameter("age");
		int age=Integer.parseInt(pAge);
		
		Person p=new Person();
		p.setfName(fName);
		p.setlName(lName);
		p.setAge(age);
		
		
	
		ArrayList<Person> pList= (ArrayList<Person>) ses.savePerson(p);
		
		request.setAttribute("list", pList);
		
		
		RequestDispatcher reqD=request.getRequestDispatcher("index.jsp");
		reqD.forward(request, response);
		
		
	}

}
