
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
<title>Insert title here</title>
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
<body>
	<nav class="navbar navbar-default"> <a href="/"
		class="navbar-brand">Brand</a>

	<ul class="nav navbar-nav">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="/list-todo.do">Todos</a></li>

	</ul>

	<ul class="nav navbar-nav navbar-right">
		<li><a href="/logout.do">Logout</a></li>
	</ul>

	</nav>

	<div class="container">
		<form action="/add-todo.do" method="post">
			<fieldset class = "form-group">
				<label>Description: </label>
				<input class = "form-control" type="text" name="newTodo">
			</fieldset>
			<fieldset class = "form-group">
				<label>Category: </label>
				<input class = "form-control" type="text" name="category">
			</fieldset>
			<input class ="btn btn-success"
				type="submit" value="Add">
		</form>
	</div>

	<footer class="footer">
	<div></div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>