package com.ubei.http.service;

import com.ubei.http.dao.FlightDao;
import com.ubei.http.dto.FlightDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.stream.Collectors.toList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FlightService {

    private static final FlightService INSTANCE = new FlightService();
    private final FlightDao flightDao = FlightDao.getInstance();

    public List<FlightDto> findAll() {
        return flightDao.findAll().stream()
                .map(flight -> FlightDto.builder()
                        .id(flight.getId())
                        .description(        """
                                %s - %s - %s
                        """.formatted(flight.getDepartureAirportCode(), flight.getArrivalAirportCode(), flight.getStatus()))
                        .build()
                )
                .collect(toList());
    }

    public static FlightService getInstance() {
        return INSTANCE;
    }
}
