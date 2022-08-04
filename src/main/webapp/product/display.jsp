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
<h1>List Product</h1>
<button style="margin-bottom: 10px"><a style="text-decoration: none" href="/product?action=create">Create new product</a></button>
<table border="1" width="800px">
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Price</th>
        <th>Color</th>
        <th>Amount</th>
        <th>Description</th>
        <th>Category</th>
        <th colspan="3">Action</th>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td>${p.getId()}</td>
            <td>${p.getName()}</td>
            <td>${p.getPrice()}</td>
            <td>${p.getColor()}</td>
            <td>${p.getAmount()}</td>
            <td>${p.getDescription()}</td>
            <td>${p.getCategory().getName()}</td>
            <td><button><a style="text-decoration: none" href="/product?action=update&id=${p.getId()}">Update</a></button></td>
            <td><button><a style="text-decoration: none" href="/product?action=delete&id=${p.getId()}">Delete</a></button></td>
            <td><button><a style="text-decoration: none" href="/product?action=detail&id=${p.getId()}">Detail</a></button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
