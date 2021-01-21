<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%> 
<%@page import="com.phenon.peson.Person"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/validation.js"></script>

</head>
<body>
	<form action="registerlink" method="post">
		<input type="text" name="firstname"  placeholder="ENTER FIRSTNAME"><hr>
		<input type="text" name="lastname"  placeholder="ENTER LASTNAME"><hr>
		<input type="number" name="age" placeholder="ENTER AGE"><hr>
		<input type="submit" value="submit">
	</form>
	<h1>list of person</h1>
	<table border ="1" width="500" > 
         <tr > 
          <th>firstName</th> 
          <th>lastname</th> 
          <th>age</th> 
         </tr> 
        <%ArrayList<Person> plist =(ArrayList<Person>)request.getAttribute("list"); 
        if(plist != null) {%>
        <%
        for(Person p:plist){%> 
       
            <tr> 
                <td><%=p.getfName()%></td> 
                <td><%=p.getlName()%></td> 
                <td><%=p.getAge() %></td>
            </tr> 
             <%}%> 
             <%} %>
        </table> 
	
</body>
</html>