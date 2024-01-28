package com.ubei.http.entity;

import java.util.Arrays;
import java.util.Optional;

public enum Gender {
    MALE,
    FEMALE;

    public static Optional<Gender> find(String name) {
        return Arrays.stream(values())
                .filter(gender -> gender.name().equals(name))
                .findFirst();
    }
}
