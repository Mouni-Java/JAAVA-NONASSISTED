<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Products Details Page</h3>
<c:set var="product" value="${obj }"></c:set>
Id: ${product.id } <br>
Name: ${product.name } <br>
Price: ${product.price } <br>
Date: ${product.dateAdded } <br><br>
<a href="edit.jsp">Click here to update</a> <br><br>
<a href="index.jsp">Click here to go back to home page</a>
</body>
</html>