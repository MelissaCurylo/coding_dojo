<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>

<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
<meta charset="ISO-8859-1">

<title>Gold Dash-board</title>

</head>

	<body class="container1">	
		<div class="container2">
			<div class="header"> <h2>Welcome to the Game of Ninja Gold!</h2> </div>
				
				<div class="headerBar">
					<div class="divSpaceAccountBox">
						<label class="accountBox"> Current Gold in Account: 
								<c:out value="${goldInAccount}" /> 
						</label> 
					</div>
					
					<div class="boxReset"> 
						<form action="/reset">
							<button class="btnReset" type="submit" name="locations" value="reset" > Reset Game </button> 
						</form>	
					</div>
				</div>

				
	
			
			<div class="card-group">	
			
					<form action="/findGold" method="POST">
						<div class="divSpace">
								<div class="card">
									<img src="images/farm-yard-7355128_640.png" class="card-img-top" alt="farm" />
					
									<div class="card-body"> 
										<h2 class="card-title">Farm</h2>
										<p class="card-text"> Build a Farm </p>
										<p class="card-text"> Earn 1 to 20 in Gold </p>
														
										<div class="card-footer">
											<div class="divSpaceBtn"> 
												<button class="btn" type="submit" name="locations" value="farm" > Find Gold! </button> 
											</div>
										</div>
									</div>
								</div>
							</div>
					</form >
						
						
					<form action="/findGold" method="POST">
						<div class="divSpace">
							<div class="card">
								<img src="images/cave.jpg" class="card-img-top" alt="card-group-image" />
				
								<div class="card-body"> 
									<h2 class="card-title">Cave</h2>
									<p class="card-text"> Find Treasure in HideAway Cave </p>
									<p class="card-text"> Earn 5 to 10 in Gold </p>
									
									<div class="card-footer">
										<div class="divSpaceBtn">
											<button class="btn" type="submit" name="locations" value="cave"> Find Gold! </button> 
										</div>
									</div>
								</div>
							</div>
						</div>
					</form >
										
										
					<form action="/findGold" method="POST">
						<div class="divSpace">
							<div class="card">
								<img src="images/house.jpg" class="card-img-top" alt="card-group-image" />
				
								<div class="card-body"> 
									<h2 class="card-title"> House </h2>
									<p class="card-text"> Build a House </p>
									<p class="card-text"> Earn 2 to 5 in Gold </p>
									
									<div class="card-footer">
										<div class="divSpaceBtn">
											<button class="btn" type="submit" name="locations" value="house" > Find Gold! </button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form >
							
							
					<form action="/findGold" method="POST">
						<div class="divSpace">
							<div class="card">
								<img src="images/quest.png" class="card-img-top" alt="card-group-image" />
				
								<div class="card-body"> 
									<h2 class="card-title"> Quest </h2>
									<p class="card-text"> Quest Time </p>
									<p class="card-text"> Earn or Lose 0 to 50 in Gold </p>
									
									<div class="card-footer">
										<div class="divSpaceBtn">
											<button class="btn" type="submit" name="locations" value="quest" > Find Gold! </button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form >
					
					<form action="/findGold" method="POST">
						<div class="divSpace">
							<div class="card">
								<img src="images/spa.jpg" class="card-img-top" alt="card-group-image" />
					
								<div class="card-body"> 
									<h2 class="card-title"> Spa </h2>
									<p class="card-text"> Spa Time </p>
									<p class="card-text"> Lose 5 to 20 in Gold </p>
									
									<div class="card-footer">
										<div class="divSpaceBtn">
											<button class="btn" type="submit" name="locations" value="spa" > Find Gold! </button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</form >
				</div>	
											
									
				<div class="activityHeader"> <h2> Game Activities: </h2> </div>
				
				<div class="activityCardBody">  
					<iframe src="activity" title="Game Activity:" class="activityBox"> </iframe>
				</div>
				

		</div>	
	</body>
</html>			