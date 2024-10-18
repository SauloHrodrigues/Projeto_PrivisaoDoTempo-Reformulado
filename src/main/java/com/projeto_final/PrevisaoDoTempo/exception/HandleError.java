package com.projeto_final.PrevisaoDoTempo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleError {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleErrorIllegalArgumentException(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}