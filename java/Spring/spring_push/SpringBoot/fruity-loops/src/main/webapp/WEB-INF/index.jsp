<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!--  local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

	
<title> Fruit Store </title>

</head>

	<body class="container">
	
		<h1> Fruit Store </h1>
		<div class="table table-hover">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Name </th>
						<th scope="col">Price </th>
					</tr>
				</thead>
				<tbody>
						<c:forEach var="eachItem" items="${fruits}" >
							<tr> 
								<td > ${eachItem.name} </td>
								<td > ${eachItem.price} </td>
							</tr>
						</c:forEach>
						
				</tbody>
			</table>
		</div>
		
	</body>
</html>