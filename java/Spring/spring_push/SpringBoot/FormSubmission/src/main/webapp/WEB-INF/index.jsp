<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>


<meta charset="ISO-8859-1">

<title>Form Submission</title>

</head>

	<body class="container" >
		
		<form action="/login" method="POST">
			<h3> Login </h3>
		
			<label> Email: </label>      	<input type="text" name="email" /> 
			<label> Password: </label>      <input type="password" name="password" /> 
			<input type="submit" value="login" />
		</form>
		

	</body>
</html>