package com.example.demospringbootjava.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private String message;
    private Map<String, String> error;
}
