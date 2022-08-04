<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 07/26/2022
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Detail Product</h1>
<table border="1" width="200px">
    <tr>
        <th>Id</th>
        <td>${p.getId()}</td>
    </tr>
    <tr>
        <th>Name</th>
        <td>${p.getName()}</td>
    </tr>
    <tr>
        <th>Color</th>
        <td>${p.getColor()}</td>
    </tr>
    <tr>
        <th>Price</th>
        <td>${p.getPrice()}</td>
    </tr>
    <tr>
        <th>Quantity</th>
        <td>${p.getAmount()}</td>
    </tr>
    <tr>
        <th>Description</th>
        <td>${p.getDescription()}</td>
    </tr>
    <tr>
        <th>Category</th>
        <td>${p.getCategory().getName()}</td>
    </tr>
</table>
<button style="margin-top: 10px"><a href="/product?action=">Back to home</a></button>
</body>
</html>
