<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>


<meta charset="ISO-8859-1">

<title>Omikuji Form Results</title>

</head>
	
	<body class="container1">
		<div  class="container2ResPage" >
		
			<div class="header"> <h2> Here's Your Omikuji! </h2> </div>
			
			<form class="formContainerResPage">
				
				<div class="divSpaceResPage">
					<h3>
						In <c:out value="${pickNumber}"/> year, you will live in
						<c:out value="${city}"/> with your room-mate 
						<c:out value="${name}"/>, working as a 
						<c:out value="${profession}"/> for a living. The next 
						time you see a <c:out value="${livingThing}"/>, you will
						have good luck. <c:out value="${beNice}"/>			
					</h3>
				</div>
					
					
				<div class="divSpaceBtn">
					<a href="/"> Back to Omikuji Form</a>
	  			</div>
	  			
			</form>
		</div>
	</body>
</html>