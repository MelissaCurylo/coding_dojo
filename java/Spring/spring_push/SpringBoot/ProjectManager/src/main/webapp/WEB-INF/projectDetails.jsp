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

<title>Project Details</title>

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

						
			<div class="tableSpace">
				<div class="leftSpace"> <h2>Project Details:</h2> </div>	
					<fieldset> 
						<table class="table table-striped">	
				
							<tr>
								<th> Project: </th>
								<td> <c:out value="${oneProject.title}"></c:out> </td>
							</tr>
							
							<tr>
								<th> Description: </th>
								<td> <c:out value="${oneProject.description}"></c:out> </td>
							</tr>
							
							<tr>
								<th> Due Date: </th>
								<td> <fmt:formatDate type="date" pattern="MMMM dd yyyy" value="${oneProject.dueDate}"/> </td>
							</tr>
		  				</table>
		  				
		  				<div class="taskLink"><a href="" class="active">See Tasks!</a></div>
		  				
						<c:if test="${oneProject.teamlead.id==userId}">
							<form action="/projects/delete/${oneProject.id}" method="post">
								<div class="btn-holder">	
									<input type="hidden" name="_method" value="delete" />
									<button type="submit" class="btn btn-danger"> Delete </button>
								</div>
							</form>	
						</c:if>
			
		  				
	  				</fieldset>
  				</div>
	  				
	  				<div class="buttonContainer">	
	  				
						
				   </div>

		</div>	
		
			

	</body>
</html>