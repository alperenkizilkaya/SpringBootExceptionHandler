package com.example.exceptionhandler.exception;

public class EntityNotFoundException extends Exception{

    public EntityNotFoundException(String message){
        super(message);
    }
}