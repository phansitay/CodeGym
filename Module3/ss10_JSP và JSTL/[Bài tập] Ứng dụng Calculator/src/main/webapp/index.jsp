<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/10/2022
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="CalculatorServlet" method="get">
    First Operand
    <input type="text" name="firstOperand">
    Operator
    <select name="operator">
      <option value="+" name="+">Cộng</option>
      <option value="-"name="-">Trừ</option>
      <option value="*"name="*">Nhân</option>
      <option value="/"name="/">Chia</option>
    </select>
    Second Operand
    <input type="text" name="secondOperand">

  </form>
  </body>
</html>
