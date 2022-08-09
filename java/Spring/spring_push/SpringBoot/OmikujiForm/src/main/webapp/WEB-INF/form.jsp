<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>

<meta charset="ISO-8859-1">

<title>Omikuji Form </title>

</head>

	<body class="container1">
		<div  class="container2" >
		
			<div class="header"> <h2> Send an Omikuji! </h2> </div>
			
			<form action="/formSubmit" method="POST" class="formContainer">
				
				<div class="divSpace">
					<label class="numberLabel"> Pick any number:  </label>      	
					<input class="numberLabel" type="number" name="pickNumber" /> 
				</div>
				
				<div class="divSpace">
					<label class="generalLabel"> Enter the name of any city:  </label><br>    	
					<input type="text" name="city" /> 
				</div>
				
								
				<div class="divSpace">
					<label class="generalLabel"> Enter the name of any real person:  </label><br>    	
					<input type="text" name="name" /> 
				</div>
				
				
				<div class="divSpace">
					<label class="generalLabel"> Enter professional endeavor:  </label><br>      	
					<input type="text" name="profession" /> 
				</div>
				
							
				<div class="divSpace">
					<label class="generalLabel"> Enter any type of living thing:  </label><br>   	
					<input type="text" name="livingThing" /> 
				</div>
				
							
				<div class="divSpace">
					<label class="generalLabel"> Say something nice to someone:  </label><br>    
				  	<textarea name="beNice" ROWS="5"></textarea>
				</div>
				
				
				<div class="divSpace2">
					<label class="generalLabel"> Send and show a friend! </label><br>    
				</div>
				
				
				<div class="divSpaceBtn">
		  			<input class="btn" type="submit" value="Send" />
	  			</div>
	  			
			</form>
		</div>
		
		
	</body>
</html>