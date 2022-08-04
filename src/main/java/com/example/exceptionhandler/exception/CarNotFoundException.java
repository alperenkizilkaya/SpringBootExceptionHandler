package com.example.exceptionhandler.exception;

public class CarNotFoundException extends EntityNotFoundException {

    public CarNotFoundException(String message) {
        super(message);
    }
}
