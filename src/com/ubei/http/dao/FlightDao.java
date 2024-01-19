package com.ubei.http.dao;

import com.ubei.http.entity.Flight;

import java.util.List;
import java.util.Optional;

public class FlightDao implements Dao<Long, Flight> {

    @Override
    public List<Flight> findAll() {
        return null;
    }

    @Override
    public Optional<Flight> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Flight entity) {

    }

    @Override
    public Flight save(Flight entity) {
        return null;
    }
}
