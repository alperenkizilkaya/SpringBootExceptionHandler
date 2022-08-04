package com.example.exceptionhandler.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({CarNotFoundException.class})
    public String CarNotFoundExceptionHandler(){
        return "car not found!!";
    }

    @ExceptionHandler({EntityNotFoundException.class})
    public String EntityNotFoundExceptionHandler(){
        return "entity not found!!";
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public String illegalArgumentExceptionHandler(){
        return "wrong argument!!";
    }

    @ExceptionHandler({Exception.class})
    public String exceptionHandler(){
        return "something is wrong try again later!!";
    }
}
