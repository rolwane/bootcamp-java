package com.bootcamp.storage02.handler;

import com.bootcamp.storage02.exception.ExceptionDetails;
import com.bootcamp.storage02.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> notFoundExceptionHandler(NotFoundException ex) {
        return new ResponseEntity<>(ExceptionDetails.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .title("BAD REQUEST")
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build(), HttpStatus.BAD_REQUEST);
    }
}
