<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>

<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
<meta charset="ISO-8859-1">

<title> Play Game Page</title>

</head>			
	<body class="container1">	
		<div class="container2">	
			<div class="card-groupGamePlay">	
					<form action="/findGold">
						<div class="divSpaceGamePlay">
								<div class="card">
									<img src="" class="card-img-top" alt="card-group-image" />
									<div class="header"> <h2>Welcome to the Game of Ninja Gold!</h2> </div>
											
									<div class="card-body"> 												
										<div class="card-footer">
											<div class="divSpaceBtnGamePlay"> 
												<button class="btnGamePlay" type="submit" > Play Game! </button> 
											</div>
										</div>
									</div>
								</div>
							</div>
					</form >
				</div>
		</div>
	</body>
</html>