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
<h1>Update Product</h1>
<form action="/product?action=update" method="post">
    <label><input type="text" name="id" value="${p.getId()}" hidden></label>
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name" id="name" value="${p.getName()}"></td>
        </tr>
        <tr>
            <td><label for="price">Price</label></td>
            <td><input type="text" name="price" id="price" value="${p.getPrice()}"></td>
        </tr>
        <tr>
            <td><label for="color">Color</label></td>
            <td><input type="text" name="color" id="color" value="${p.getColor()}"></td>
        </tr>
        <tr>
            <td><label for="amount">Amount</label></td>
            <td><input type="text" name="Amount" id="amount" value="${p.getAmount()}"></td>
        </tr>
        <tr>
            <td><label for="description">Description</label></td>
            <td><input type="text" name="description" id="description" value="${p.getDescription()}"></td>
        </tr>
        <tr>
            <td><label for="category">Category</label></td>
            <td>
                <select name="category" id="category">
                    <c:forEach items="${categories}" var="c">
                        <option value="${c.getId()}">${c.getName()}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Update</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
