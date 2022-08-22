<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<title>Projects Dashboard</title>

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
					  <a href="/projects/add" > Add new project</a>
					  <a href="/logout" class="text-warning">Logout</a>
					</div>
				</form>
			</nav>
					
			<div class="tableSpace">
				<fieldset> <h3> All Projects </h3>
					<table class="table table-striped">
						<thead>
							<tr>
								<th> Project Title </th>
								<th> Team Lead </th>
								<th> Due Date </th>
								<th colspan="2"> Actions Available </th>
							</tr>
						</thead>
						<tbody>				 
							<c:forEach var="eachProject" items="${unassignedProjects}">
								<tr>	
									<c:if test = "${project.teamlead.id != user.id}"> 		
										<td> <a href="/projects/${eachProject.id}"> <c:out value="${eachProject.title}"/> </a> </td>
										<td> <c:out value="${eachProject.teamlead.firstName}"/> </td>
										<td> <fmt:formatDate type="date" pattern="MMMM dd" value="${eachProject.dueDate}"/> </td> 
										<td> <a href="/dashboard/join/${eachProject.id}"  class="btn btn-success">Join Team</a> </td>
									</c:if>
																		
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</fieldset>
			 </div>
			 
			 
			 
			 <div class="tableSpace">
				<fieldset> <h3> Your Projects </h3>
					<table class="table table-striped">
						<thead>
							<tr>
								<th> Project Title </th>
								<th> Team Lead </th>
								<th> Due Date </th>
								<th colspan="2"> Actions Available </th>
							</tr>
						</thead>
						
						
						<tbody>
							<c:forEach var="eachProject" items="${assignedProjects}">
								<tr>						
									<td> <a href="/projects/${eachProject.id}"> <c:out value="${eachProject.title}"/> </a> </td>
									<td> <c:out value="${eachProject.teamlead.firstName}"/> </td>
									<td> <fmt:formatDate type="date" pattern="MMMM dd yyyy" value="${eachProject.dueDate}"/> </td> 
									<td> 
										<c:if test="${eachProject.teamlead.id == user.id}">
											<a href="/projects/edit/${eachProject.id}"  class="btn btn-warning">Edit</a>
										</c:if>
									</td>
									<td>									
										<c:if test="${eachProject.teamlead.id != user.id}">
											<a href="/dashboard/leave/${eachProject.id}"  class="btn btn-danger">Leave Team</a>
										</c:if>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					
					</table>
				</fieldset>
			 </div>

			
		</div>	
	</body>
</html>