<%--
  Created by IntelliJ IDEA.
  User: ubei0
  Date: 25.01.2024
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/registration" method="post">
        <label for="name">Name:
            <input type="text" name="name" id="name">
        </label><br>
        <label for="birth">Birthday:
            <input type="date" name="birth" id="birth">
        </label><br>
        <label for="email">Email:
            <input type="email" name="email" id="email">
        </label><br>
        <label for="password">Password:
            <input type="password" name="password" id="password">
        </label><br>
        <label for="role">Role:
            <select name="role" id="role">
                <option value="USER">User</option>
                <option value="ADMIN">Admin</option>
            </select><br>
        </label><br>
        <input type="radio" name="gender" value="MALE"> Male <br>
        <input type="radio" name="gender" value="FEMALE"> Female <br>
        <button type="submit">Send</button>
    </form>
</body>
</html>
