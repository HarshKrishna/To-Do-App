<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>To Do List</title>
</head>
<body>
<form action = "/harsh.co" method = "post">
	<h5>Username : <input type = "text" name="name"/></h5>
	<h5>Password : <input type = "password" name="password"/></h5>
	<br>
	<input type = "submit" value="Submit"/>
	<p><font color="red">${errorMessage}</font></p>
</form>
</body>
</html>