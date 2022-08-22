<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Project Task Details</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>

	<body>
	
		<div class="container mt-4">	
		<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
				<div class="loggedInAs"> 
					<p>Logged in as: <c:out value="${firstName}"> </c:out> </p> </div>
				<div class="leftSpace"> <h3> One Team, One Mission </h3> </div>
				
				
				<form class="form-inline">
					<div class="pill-nav">
					  <a href="/dashboard" > Home </a>
					  <a href="/projects/add" > Add new project</a>
					  <a href="/logout" class="text-warning">Logout</a>
					</div>
				</form>
			</nav>

						
					
			<div class="leftSpace"> <h2>Project:</h2> </div>	
			<h1> adding task features in new upload </h1>
			


  					
  				
		</div>	
		

		

	</body>
</html>