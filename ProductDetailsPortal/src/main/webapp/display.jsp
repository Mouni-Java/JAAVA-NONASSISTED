<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>***Displaying the ProductDetails***</h1>
<%
String name=request.getParameter("name");
int quantity=Integer.parseInt(request.getParameter("quantity"));
int price=Integer.parseInt(request.getParameter("price"));
out.println("Product Name:" +name);
out.println("<br><br>");
out.println("Product Quantity:" +quantity);
out.println("<br><br>");
out.println("Product Price:" +price);
%>

</body>
</html>