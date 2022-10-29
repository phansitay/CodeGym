<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/10/2022
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete prodcuct</h1>
<p>
    <a href="/ProductServlet">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getNameProduct()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["product"].getPriceProduct()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["product"].getDescriptProduct()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/ProductServlet">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
