<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FindBook</title>
</head>
<body>
BookName<input type="text" name="name">
<button type="submit" >Find</button>
<table border=1>
<thead>
<tr>
<th>Id</th>
<th>Name</th>
<th>Price</th>
</tr>
</thead>
<tbody>
<c:forEach var="foundBook" items="${books}">
<tr>
<td> ${bookid} </td>
<td>${bookname }</td>
<td>${price }</td>
</tr>
</c:forEach>
</tbody>




</table><br><br>
<a href="Home.jsp">Home</a>
</body>
</html>