<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${cards}" var="card">
        <h1>Id :  ${card.id}</h1>
        <h1>Name :  ${card.name}</h1>
        <h2>Description : ${card.description}</h2>
        <hr>
    </c:forEach>

    <a href="index.jsp">Go back to home</a>
</body>
</html>
