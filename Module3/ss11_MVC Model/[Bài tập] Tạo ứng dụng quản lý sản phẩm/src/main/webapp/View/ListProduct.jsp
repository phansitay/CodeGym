<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/10/2022
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Danh sách sản phẩm</title>
  </head>
  <body>
  <table>
      <tr>
          <th>Id</th>
          <th>Product Name</th>
          <th>Product Price</th>
          <th>Product Descript</th>
      </tr>
      <c:forEach var="product" items="${products}" varStatus="status">
      <tr>
          <td>${status.count}</td>
          <td>${product.getNameProduct()}</td>
          <td>${product.getPriceProduct()}</td>
          <td>${product.getDescriptProduct()}</td>
      </tr>
      </c:forEach>
  </table>
  <a href="/ProductServlet"></a>
  <form action="/ProductServlet?action=add" method="post">
      <button type="submit"> Send</button>
  </form>
  </body>
</html>
