package com.ubei.http.service;

import com.ubei.http.dao.FlightDao;

public class FlightService {

    private static final FlightService INSTANCE = new FlightService();
    private final FlightDao flightDao = FlightDao.getInstance();

    private FlightService() {
    }

    public static FlightService getInstance() {
        return INSTANCE;
    }
}
