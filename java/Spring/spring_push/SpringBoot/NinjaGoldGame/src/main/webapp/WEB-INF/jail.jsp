<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>

	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
	
<meta charset="ISO-8859-1">
<title>Jail Time....</title>
</head>		
	<body class="container1">	
		<div class="container2">	
			<div class="card-groupGamePlay">
				
					<form action="/reset">
						<div class="divSpaceGameOver">
								<div class="card">
									<div class="card-body"> 		
										<img src="images/gameover.jpg" class="card-img-top" alt="card-group-image" />
										
											<div> 
												<h1 class="headerGameOver"> Game OVER! </h1>
											</div>
											
											<div> 
												<h3 class="headerGameOver"> Womp Womp Womp.....</h3> 
												<h3 class="headerGameOver"> Your quests and spa times have landed you in jail.</h3> 
											</div>
																					
											<div class="card-footer">
												<div class="divSpaceBtnGamePlay"> 
													<button class="btnGamePlay" type="submit" > Play Again! </button> 
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