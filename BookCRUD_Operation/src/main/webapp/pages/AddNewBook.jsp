<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Book Details</title>
</head>
<body>
<h1> Application Form </h1>
<f:form action="save" modelAttribute="book" method="get">
<table border="1">
<tr>
<td> BookNo. : <f:input path="id"/></td>
</tr>

<tr>
<td> Title : <f:input path="title"/></td>
</tr>

<tr>
<td> Author : <f:input path="author"/></td>
</tr>

<tr>
<td> Year : <f:input path="year"/></td>
</tr>

<tr>
<td align="center"> <input type="submit" value="save"> </td>
</tr>
</table>
</f:form>
</body>
</html>