<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>
</head>
<body>
<h1>All Book Details</h1>
<table border="1">
<thead>
<th>BookNo</th>
<th>Title</th>
<th>Author</th>
<th>Year</th>
<th>Action</th>
</thead>

<tbody>
<j:forEach items="${allbook }" var="book">
<tr>
<td>${book.id }</td>
<td>${book.title }</td>
<td>${book.author }</td>
<td>${book.year }</td>
<td> <a href="/update/${book.id}">Edit </a> | <a href="/delete/${book.id }" >Delete </a></td>
</tr>
</j:forEach>
</tbody>

</table>
<br>
<a href="/NewBook"> Add New Book </a>
</body>
</html>