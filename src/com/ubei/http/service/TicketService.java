package com.ubei.http.service;

public class TicketService {

    private static final TicketService INSTANCE = new TicketService();

    private TicketService() {
    }

    public static TicketService getInstance() {
        return INSTANCE;
    }
}
