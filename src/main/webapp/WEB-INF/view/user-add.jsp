<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.07.2021
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .content-table {
        border-collapse: collapse;
        margin: 25px 0;
        font-size: 0.9em;
        font-family: sans-serif;
        min-width: 400px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    }

    .content-table th,
    .content-table td {
        padding: 12px 15px;
    }

    .content-table tbody tr {
        border-bottom: 1px solid #dddddd;
    }

    .content-table tbody tr:nth-of-type(even) {
        background-color: #f3f3f3;
    }

    .content-table tbody tr:last-of-type {
        border-bottom: 2px solid #009879;
    }

</style>

<body>

    <div align="center">
    <h3>Save user</h3>
    <form:form method="post" action="/save" modelAttribute="user">
    <table class="content-table">
        <tbody>
        <tr>
            <form:hidden path="id"/>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="phoneNumber">Phone number</form:label></td>
            <td><form:input path="phoneNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save"></td>
        </tr>
        </tbody>
    </table>
    </form:form>
    </div>

</body>
</html>
