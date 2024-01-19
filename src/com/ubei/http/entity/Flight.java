package com.ubei.http.entity;

import java.time.LocalDateTime;

public class Flight {
    
    private Long id;
    private String flightNo;
    private LocalDateTime departureDate;
    private String departureAirportCode;
    private LocalDateTime arrivalDate;
    private String arrivalAirportCode;
    private Long aircraftId;
    private FlightStatus status;
}
