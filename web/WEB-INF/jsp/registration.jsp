<%--
  Created by IntelliJ IDEA.
  User: ubei0
  Date: 25.01.2024
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <img width="400px" src="${pageContext.request.contextPath}/images/users/AtomicHeart_sample.jpg" alt="">
    <form action="${pageContext.request.contextPath}/registration" method="post" enctype="multipart/form-data">
        <label for="name">Name:
            <input type="text" name="name" id="name">
        </label><br>
        <label for="birth">Birthday:
            <input type="date" name="birth" id="birth">
        </label><br>
        <label for="image">Image:
            <input type="file" name="image" id="image">
        </label><br>
        <label for="email">Email:
            <input type="email" name="email" id="email">
        </label><br>
        <label for="password">Password:
            <input type="password" name="password" id="password">
        </label><br>
        <label for="role">Role:
            <select name="role" id="role">
                <c:forEach var="userRole" items="${requestScope.roles}">
                    <option value="${userRole}">
                            ${fn:substring(userRole, 0, 1)}${fn:toLowerCase(fn:substring(userRole, 1, fn:length(userRole)))}
                    </option>
                </c:forEach>
            </select><br>
        </label><br>
        <label for="gender">Gender: <br>
        <c:forEach var="userGender" items="${requestScope.genders}">
                <input type="radio" name="gender" id="gender" value="${userGender}">
                ${fn:substring(userGender, 0, 1)}${fn:toLowerCase(fn:substring(userGender, 1, fn:length(userGender)))}<br>
        </c:forEach>
        </label>
        <button type="submit">Send</button>
    </form>
    <div style="color: red">
        <c:if test="${not empty requestScope.errors}">
            <c:forEach var="error" items="${requestScope.errors}}">
                <p>${error}</p>
            </c:forEach>
        </c:if>
    </div>
</body>
</html>
