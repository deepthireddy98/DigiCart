<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="jq" value="/resources/jq" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Footer</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>DigiCart</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.item {
	height: 100%;
	width: 100%;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: blue;
	color: white;
	text-align: center;
}
</style>
</head>
<body>

	<div id="footer">
		<div class="container">
			<div class="centered clearfix"></div>
			<div class="bottom-bar">
				<a href="https://www.facebook.com/"> <i style="font-size: 24px"
					class="fa">&#xf082; </i></a> <a href="https://twitter.com/login"> <i
					style="font-size: 24px" class="fa">&#xf099;</i></a> <a
					href="https://plus.google.com/"> <i style="font-size: 24px"
					class="fa">&#xf0d5;</i>
				</a> All Rights Reserved � 2018 | <a href="${contextRoot}/aboutUs">About
					Us</a> | <a href="${contextRoot}/contactUs">Contact US</a>
			</div>
		</div>
	</div>
</body>
</html>