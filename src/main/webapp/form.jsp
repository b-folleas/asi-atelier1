<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Create Card Form</title>
</head>
<body>
<h1>Guru Register Form</h1>
<form action="create-card" method="post">
    <table style="with: 50%">
        <tr>
            <td>Id</td>
            <td><input type="number" name="id" /></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" /></td>
        </tr>
        </table>
    <input type="submit" value="Submit" /></form>

    <a href="index.jsp">Go back to home</a>
</body>
</html>
