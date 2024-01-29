package com.ubei.http.exception;

import com.ubei.http.validator.Error;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ValidationException extends RuntimeException {

    private final List<Error> errors;
}
