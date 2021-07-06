<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 06.07.2021
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 align="center">Users list</h1>

    <div align="center">
        <table border="2">
            <thead>
                <tr>
                    <td>Id</td>
                    <td>Name</td>
                    <td>Email</td>
                    <td>Number</td>
                </tr>
            </thead>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.phoneNumber}</td>
                </tr>
            </c:forEach>

        </table>
    </div>

</body>
</html>
