package com.example.exceptionhandler.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {

    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private int code;
    private String message;

    public ApiError(HttpStatus status, int code, String message) {
        timestamp = LocalDateTime.now();
        this.status= status;
        this.code = code;
        this.message = message;
    }

}
