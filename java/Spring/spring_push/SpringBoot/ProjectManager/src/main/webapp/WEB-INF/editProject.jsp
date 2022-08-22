<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<title> Edit Project </title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>

	<body>
	
	<div class="container mt-4">
	
			<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
				<div class="loggedInAs"> <p>Logged in as: <c:out value="${firstName}"></c:out> </p> </div>
				<div class="leftSpace"> <h3> One Team, One Mission </h3> </div>
				
				
				
				<form class="form-inline">
					<div class="pill-nav">
					  <a href="/dashboard" > Home </a>
					  <a href="/projects/add" > Add new project</a>
					  <a href="/logout" class="text-warning">Logout</a>
					</div>
				</form>
			</nav>
			
			
			<div class="tableSpace">
				<h1> Edit Project </h1>
				<fieldset> 
					<table class="table table-striped">

					<form:form action="/projects/edit/${project.id}" method="post" modelAttribute="project">
					<form:hidden path="teamlead" />
					<input type="hidden" name="_method" value="PUT" />
					
						<div class="form-group">
							<form:label path="title"> Project Title:</form:label>
							<form:input path="title" type="text" class="form-control" />
							<form:errors path="title" class="text-danger" />
						</div>
						
						
						<div class="form-group">
							<form:label path="description"> Project Description:</form:label>
							<form:textarea path="description" type="text" class="form-control" />
							<form:errors path="description" class="text-danger" />
						</div>
						
						
						<div class="form-group">
							<form:label path="dueDate"> Project Title:</form:label>
							<form:input path="dueDate" type="date" class="form-control" />
							<form:errors path="dueDate" class="text-danger" />
						</div>
						
						<form class="form-inline">
							<div class="pill-nav">
								<button class="btn btn-success"> Update Project </button>
								<a href="/dashboard" class="btn btn-danger"> Cancel </a>
							</div>
						</form>
			
					</form:form>
				</table>
			</fieldset>
		 </div>
					
					
					
		</div>		

	</body>
</html>