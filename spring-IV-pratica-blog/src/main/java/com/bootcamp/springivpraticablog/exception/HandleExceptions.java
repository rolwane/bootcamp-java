package com.bootcamp.springivpraticablog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptions {

    @ExceptionHandler(IdAlreadyRegisteredException.class)
    public ResponseEntity<ExceptionDetails> handlerIdAlreadyRegistered(IdAlreadyRegisteredException e) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .status(400)
                .error("Bad Request")
                .message(e.getMessage())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerNotFound(NotFoundException e) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .status(404)
                .error("Not Found")
                .message(e.getMessage())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }
}
