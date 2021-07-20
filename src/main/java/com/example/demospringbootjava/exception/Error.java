package com.example.demospringbootjava.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {
    private int statusCode;
    private String message;

}
