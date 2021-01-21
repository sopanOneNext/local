<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/validation.js"></script>

</head>
<body>
<% 
	String fname=request.getParameter("firstname");
	String lname=request.getParameter("lastname");
	String age=request.getParameter("age");

%>
<h1>your firstname <%=fname %></h1>
<h1>your lastname <%=lname %></h1>
<h1>your age <%=age %></h1>

</body>
</html>