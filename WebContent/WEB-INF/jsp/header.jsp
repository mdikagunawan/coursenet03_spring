<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999.xhtml" th:fragment="top_area">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- dari bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<ul class="nav navbar-nav">
			<li class="nav-item"><a class="nav-link" th:href="@{/}"> <span
					class="fas fa-home"></span> Home
			</a></li>
			<li class="nav-item"><a class="nav-link" th:href="@{/about}">
					<span class="fas fa-star"></span> About
			</a></li>
			<li class="nav-item"><a class="nav-link" th:href="@{/register}">
					<span class="fas fa-people"></span> Register
			</a></li>
			<!-- Register 2 untuk tes connect ke database -->
			<li class="nav-item"><a class="nav-link" th:href="@{/register2}">
					<span class="fas fa-people"></span> Register 2
			</a></li>
			<li class="nav-item"><a class="nav-link" th:href="@{/list}">
					<span class="fas fa-list"></span> List User
			</a></li>
		</ul>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
			
			</br>