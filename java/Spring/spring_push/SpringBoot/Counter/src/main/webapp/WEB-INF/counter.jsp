<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<title> Getting Counted or Restart </title>

</head>

	<body>
	
		<h1>Welcome to the home page, you have visited the home <c:out value="${count}" /> times </h1>
		<p> <a href="/"> Add one visits </a> </p>
		<p> <a href="/counted2"> Add two visits </a> </p>
		<p> <a href="/reset"> Reset visits </a>
			
		

	</body>
</html>