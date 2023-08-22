package com.example.restcontrolleradviceannotation.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NullPointerException.class)
    public Map<String,String > handleNullPointerException(NullPointerException nullPointerException){
        Map<String,String>  errorMap = new HashMap<String,String>();

        errorMap.put("Error Msg" , nullPointerException.getMessage());
        return errorMap;
    }
}
