<%--
  Created by IntelliJ IDEA.
  User: ubei0
  Date: 24.01.2024
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty sessionScope.user}">
    <form action="${pageContext.request.contextPath}/logout" method="post">
        <button type="submit">Logout</button>
    </form>
</c:if>
