package com.example.exceptionhandler.exception;

import com.example.exceptionhandler.constant.ResultMessageCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({CarNotFoundException.class})
    public ResponseEntity<Object>  carNotFoundExceptionHandler(){
        //return "car not found!!";
        //return carNotFoundException.getFailureCode();
        return buildResponseEntity(new ApiError(HttpStatus.NOT_FOUND, ResultMessageCode.CarNotFound.getCode(), ResultMessageCode.CarNotFound.getMessage())) ;
    }

    @ExceptionHandler({EntityNotFoundException.class})
    public ApiError entityNotFoundExceptionHandler(){
        return new ApiError(HttpStatus.NOT_FOUND, ResultMessageCode.EntityNotFound.getCode(), ResultMessageCode.EntityNotFound.getMessage());
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public ApiError illegalArgumentExceptionHandler(){
        //return "wrong argument!!";
        return new ApiError(HttpStatus.BAD_REQUEST, ResultMessageCode.IllegalArgument.getCode(), ResultMessageCode.IllegalArgument.getMessage());
    }

    @ExceptionHandler({Exception.class})
    public ApiError exceptionHandler(){
        //return "something is wrong try again later!!";
        return new ApiError(HttpStatus.NOT_ACCEPTABLE, ResultMessageCode.SomethingWrong.getCode(), ResultMessageCode.SomethingWrong.getMessage());
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
