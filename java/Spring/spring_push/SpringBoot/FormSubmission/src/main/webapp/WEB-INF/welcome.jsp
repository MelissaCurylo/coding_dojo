<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>

	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>

<meta charset="ISO-8859-1">

<title>Welcome Page </title>

</head>

	<body class="container">
	
 
	<h1> Welcome! </h1>
	<h5> Please verify your credentials: </h5>
	 <p> Email: <c:out value="${email}" /> </p>
		
	</body>
</html>