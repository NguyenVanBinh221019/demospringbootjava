package com.example.demospringbootjava.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorMessage handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> details = new HashMap<>();
        String fieldName;
        String errorMessage;
        for( ObjectError error : ex.getBindingResult().getAllErrors()) {
            fieldName = ((FieldError) error).getField();
            errorMessage = error.getDefaultMessage();
            details.put(fieldName, errorMessage);
        }
        return new ErrorMessage(123,"List error:",details) ;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error handleAllException(Exception ex) {
        return new Error(401,"Error");
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error handleNullPointerExceptions(NullPointerException ex) {
        return new Error(500, "Object does not exist");
    }
}
