package com.example.dashboard.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyHandle {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> checkAll(Exception e){
        ErrorResponse err = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return  ResponseEntity.badRequest().body(err);
    }

}