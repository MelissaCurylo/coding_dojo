<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>

<meta charset="ISO-8859-1">

<title> Dashboard View </title>

</head>	
	<body class="container1">
		<div  class="container2ResPage" >
		
			<div class="header"> <h2> Welcome to your Dashboard! </h2> </div>
			
			<form class="formContainerResPage">
				
					<div class="divSpaceResPage">
							<h4> Please verify your credentials: </h4>
							<p> Email: <c:out value="${email}" /> </p>
					</div>
						
						
					<div class="divSpaceBtn">
							<a href="/"> Logout </a>
		  			</div>
	  			
			</form>
		</div>
	</body>
</html>