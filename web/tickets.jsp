<%@ page import="com.ubei.http.dto.TicketDto" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ubei.http.service.TicketService" %><%--
  Created by IntelliJ IDEA.
  User: ubei0
  Date: 24.01.2024
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--<%@ taglib prefix="c" uri="https://mycompany.com" %>--%>
<%@ include file="index.html" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Купленные билеты:</h1>
    <ul>
        <%
            TicketService ticketService = TicketService.getInstance();
            Long flightId = Long.valueOf(request.getParameter("flightId"));
            List<TicketDto> tickets = ticketService.findAllByFlightId(flightId);
            for (TicketDto ticket: tickets) {
                out.write(String.format("<li>%s</li>", ticket.getSeatNo()));
            }
        %>
    </ul>
</body>
</html>
