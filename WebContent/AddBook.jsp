<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddBook</title>
</head>
<body>
<form action="AddBookServlet" method="post">

Name<input type="text" name="name">
Price<input type="number" name="price">
<button type="submit" >AddBook</button>
<a href="Home.jsp">Home</a>
</form>
</body>
</html>