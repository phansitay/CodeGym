<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/10/2022
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
        border: 2px solid chartreuse;
        background-color: aquamarine;

    }

    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
        text-align: center;
        font-size: 30px;
    }
</style>
<body style="background-color: antiquewhite">
<h1 style="text-align: center">Danh sách khách hàng</h1>
<table border="1">
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="CustomerServlet" items="${customerList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${CustomerServlet.getName()}</td>
            <td>${CustomerServlet.getBirthday()}</td>
            <td>${CustomerServlet.getAddress()}</td>
            <td><img src="${CustomerServlet.getImg()}" alt="đây là ảnh" width="100px" height="100px">
                    </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
