<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>

<title> Time 1 Page </title>

</head>

	<body class="container">
		
		<h1 class="time"><c:out value="${time1}"/></h1>
		<script> alert("This is the time 1 template"); </script>
		

	</body>
</html>