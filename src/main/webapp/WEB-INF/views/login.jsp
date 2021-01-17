<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>To do list Login: ${user}</h3><br>
<%
System.out.println(request.getParameter("uid"));
Date date = new Date();
%>
<p><font color="red">${errorMessage}</font></p>
<strong>Current Time is</strong>: <%=new Date() %><br>

<form action="/login.do" method="POST">
Username: <input type="text" id="uname" name="username"><br>
Password: <input type="password" id="upass" name="password"><br>
<input type="submit" id="login" name="login" value="login">
</form>

</body>
</html>