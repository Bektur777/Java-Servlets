package com.ubei.http.mapper;

public interface Mapper<F, T> {

    T mapFrom(F object);
}
