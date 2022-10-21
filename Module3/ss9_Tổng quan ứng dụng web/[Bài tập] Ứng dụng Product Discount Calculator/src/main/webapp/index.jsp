<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/10/2022
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/DiscountAmount" method="post">
    Product Description
    <input type="text" name="description">
    List Price
    <input type="text" name="price">
    Discount Percent
    <input type="text" name="discount">
    <button type="submit">Calculate Discount</button>
  </form>
  </body>
</html>
