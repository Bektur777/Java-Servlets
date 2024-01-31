<%--
  Created by IntelliJ IDEA.
  User: ubei0
  Date: 31.01.2024
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="email">Email:
            <input type="text" name="email" id="email">
        </label><br>
        <label for="password">Password:
            <input type="password" name="password" id="password">
        </label><br>
        <button type="submit">Login</button>
        <a href="${pageContext.request.contextPath}/registration">
            <button type="button">Registration</button>
        </a>
    </form>
</body>
</html>
