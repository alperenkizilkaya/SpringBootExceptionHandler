package com.example.exceptionhandler.constant;

import com.example.exceptionhandler.exception.CarApiResultCodeException;

public enum ResultMessageCode {

    SomethingWrong(-1, "opss, something is wrong try again later"),
    CarNotFound(-10, "car not found!!"),
    IllegalArgument(-20, "wrong parameter!!"),
    EntityNotFound(-11, "entity not found!!");
    private int code;
    private String message;

    private static final String UNSUPPORTED_RESULT_CODE = "Unsupported Result Code [%s]";

    ResultMessageCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultMessageCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public static ResultMessageCode getCarApiResultMessageCodeFromCode(int code) throws Exception {
        ResultMessageCode[] messageCodes = ResultMessageCode.values();
        for(ResultMessageCode messageCode : messageCodes){
            if(messageCode.getCode() == code)
                return messageCode;

        }
        throw new CarApiResultCodeException(String.format(UNSUPPORTED_RESULT_CODE, code));
    }
}
