package com.example.exceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarNotFoundException extends EntityNotFoundException {

    private int code;
    private String message;

    public CarNotFoundException(int code, String message) {
        this.code = code;
        this.message = message;

    }
}
