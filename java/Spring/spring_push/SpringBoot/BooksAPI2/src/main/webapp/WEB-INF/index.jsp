<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>

  <link href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css" rel="stylesheet">
  <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
  
  

<title> All Books</title>

</head>
	<body class="container1">
	
		<div class="container2">				
			<div class="headerBar">
				<div class="divSpaceAccountBox">

				<div class="table-users">
					<h1 class="animate__animated animate__bounce">Book List</h1>
					
						<table class="cellSpacing">
							<tr>
							   <th>ID</th>
							   <th>Title</th>
							   <th>Language</th>
							   <th>Number of Pages</th>
							</tr>
					
							<c:forEach var="book" items="${books}">
						      	<tr>
									<td> <c:out value="${book.id}"></c:out> </td>
									<td> <a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a> </td>
									<td> <c:out value="${book.language}"></c:out> </td>
									<td> <c:out value="${book.numberOfPages}"></c:out> </td>
								</tr>
							</c:forEach>
					   </table>
					</div>
				</div>
			</div>
		</div>	
	</body>
</html>