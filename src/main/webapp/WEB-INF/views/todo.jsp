<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
</head>
<%@ page import="java.util.Date" %>
<body>
<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Todoist</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
			<li><a href="https://mah1ndra.me">Mah1ndra</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
		<strong>Current Time is</strong>: <%=new Date() %><br>
        <h2> Welcome ${username}</h2>
        <h3> Todo list for ${username}: </h3>
        <ol>
            <c:forEach items="${todo}" var="todos">
            <li>${todos.name} &nbsp; &nbsp; <a href="/delete-todo.do?todo=${todos.name}">Delete</a></li>
            </c:forEach>
        </ol>
        <form action="/todo.do" method="POST">
        Add to Todo List: <input type="text" id="todo" name="todo">
        <input type="submit" id="login" name="Add" value="Add">
        </form>
	</div>

	<footer class="footer">
		<strong>Todist</strong>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>