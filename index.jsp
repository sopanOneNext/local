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
	<form action="welcome.jsp">
		<input type="text" name="firstname" id="firstname" onfocusout="validateFname()" placeholder="ENTER FIRSTNAME">
		<h6 id="nameerror"></h6><hr>
		<input type="text" name="lastname" id="lastname" onfocusout="validateLname()" placeholder="ENTER LASTNAME">
		<h6 id="lnameerror"></h6><hr>
		<input type="number" name="age" id="age" onfocusout="validateAge()" placeholder="ENTER AGE">
		<h6 id="ageerror"></h6><hr>
		<input type="submit" value="submit">
	
	</form>
</body>
</html>