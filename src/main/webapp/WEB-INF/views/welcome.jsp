<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Welcome</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<strong>Current Time is</strong>: <%=new Date() %><br>

<h3> Welcome ${username}</h3>
</body>
</html>