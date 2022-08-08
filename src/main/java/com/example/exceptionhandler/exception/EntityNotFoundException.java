package com.example.exceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EntityNotFoundException extends Exception{

    public EntityNotFoundException(String message){
        super(message);
    }
}
