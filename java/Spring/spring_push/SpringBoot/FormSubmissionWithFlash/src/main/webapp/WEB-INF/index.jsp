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

<body class="container1">
		<div  class="container2" >
			 	
		 	
			<div class="header"> <h2> Form with Flash </h2> </div>
			
			<form action="/login" method="POST" class="formContainer">
				
				<div class="divSpace">
					<label class="numberLabel"> Email:  </label><br>     	
					<input class="generalLabel" type="email" name="email" /> 
				</div>
				
				
				<div class="divSpace">
						<label class="generalLabel"> Password:  </label><br>    	
						<input type="password" name="password" /> 
					
					<c:if test="${error != null}">
						<div> 
				 			<p class="errorMessage"><c:out value="${error}" />
			 			</div>
		 			</c:if>
		 			
				</div>
				
				
				<div class="divSpaceBtn">
		  			<input class="btn" type="submit" value="login" />
	  			</div>
	  			
			</form>
		</div>
		
		
	</body>


	</body>
</html>