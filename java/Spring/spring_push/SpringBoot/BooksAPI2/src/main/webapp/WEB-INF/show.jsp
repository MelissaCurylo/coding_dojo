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

<title> Show Book By ID </title>

</head>
	<body class="container1">
		<div class="container2">				
			<div class="headerBar">
				<div class="divSpaceAccountBox">
					<div class="header"> <h2> Book Title:  <c:out value="${book.title}"></c:out> </h2> </div>
					<div><label class="accountBox"> Description:  <c:out value="${book.description}"></c:out></label> </div>
					<div><label class="accountBox"> Language:  <c:out value="${book.language}"></c:out></label> </div>
					<div><label class="accountBox"> Number of Pages:  <c:out value="${book.numberOfPages}"></c:out></label> </div>
				</div>
			</div>
		</div>
	</body>
	
</html>