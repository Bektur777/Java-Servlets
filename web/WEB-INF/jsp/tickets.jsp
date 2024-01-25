<%--
  Created by IntelliJ IDEA.
  User: ubei0
  Date: 24.01.2024
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--<%@ taglib prefix="c" uri="https://mycompany.com" %>--%>
<%--<%@ include file="index.html" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Купленные билеты:</h1>
    <c:if test="${not empty requestScope.tickets}">
        <ul>
            <c:forEach var="ticket" items="${requestScope.tickets}">
                <li>
                    ${fn:toLowerCase(ticket.seatNo)}
                </li>
            </c:forEach>
        </ul>
    </c:if>
</body>
</html>
