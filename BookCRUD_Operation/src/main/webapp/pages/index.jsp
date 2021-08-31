<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="i" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<style>
body
{
	margin: 0;
	padding: 0;
	font-family: sans-serif;
}
.container
{
	width: 100%;
	height: 100vh;
	background-image: url(/pages/Booksbgrnd.jpg);
	background-size: cover;
	background-position: center;
}
.navbar
{
	width: 88%;
	margin: auto;
	padding: 15px 10px;
	display: flex;
	align-items: center;
	justify-content: space-between;
}
.logo
{
	width: 160px;
	height: 100px;
	cursor: pointer;
	background: transparent;
	margin-left: -60px;
	margin-top: 4px;
}
.navbar ul li
{
	list-style: none;
	display: inline-block;
	margin: 0 20px;
	margin-bottom: 25px;
}
.navbar ul li a
{
	text-decoration: none;
	color: #ffffff;
	font-size: 20px;
}
.navbar ul li a:hover
{
	color: black;
}
.content
{
	width: 100%;
	position: absolute;
	top: 25%;
}
.content h1
{
	float: left;
	margin-left: 10px;
	font-size: 70px;
	color: #ffffff;
	
}
</style>
<body>
<div class="container">
	<div class="navbar">
	<img src = "/pages/BookLogo.jpg" class="logo">
	<ul>
	
	<li><a href="/NewBook"> Add New Book </a></li>
	<li><a href="/allBooks"> View All Books </a></li>
	</ul>
	</div>
	
	<div class="content">
	<h1><center><font color=black> BOOK <br> CRUD <br>  OPERATION </font></center></h1>
	</div>
</div>
</body>
</html>