package com.example.exceptionhandler.exception;

public class CarApiResultCodeException extends Exception {
    public CarApiResultCodeException(String unsupportedResultCode) {
        super(unsupportedResultCode);
    }
}
