<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sach khach hang</h2>
<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.name}"/> </td>
            <td><c:out value="${customer.dob}"/> </td>
            <td><c:out value="${customer.address}"/> </td>
            <td><img src="${customer.photo}" alt="Photo" width="100"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
