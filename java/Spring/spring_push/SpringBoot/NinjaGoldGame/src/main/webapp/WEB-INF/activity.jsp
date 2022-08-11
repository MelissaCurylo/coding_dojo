<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
<meta charset="ISO-8859-1">

<title>Activity</title>

</head>

	<body>

		<c:forEach var="activity" items="${activity}">
				
			<c:if test = "${activity.contains('added')}">
		       <p style="color: green;"><c:out value="${activity}"></c:out></p>
		    </c:if>
		    
		    <c:if test = "${activity.contains('deducted')}">
		       <p style="color: blue;"><c:out value="${activity}"></c:out></p>
		    </c:if>
		</c:forEach>

	</body>
</html>