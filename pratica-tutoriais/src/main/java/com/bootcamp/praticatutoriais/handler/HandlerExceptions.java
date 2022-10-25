package com.bootcamp.praticatutoriais.handler;

import com.bootcamp.praticatutoriais.exception.ExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.security.InvalidParameterException;
import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerExceptions {

    @ExceptionHandler(InvalidParameterException.class)
    public ResponseEntity<ExceptionDetails> handlerInvalidParamException(InvalidParameterException ex) {
        return new ResponseEntity<>(ExceptionDetails.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .title("BAD REQUEST")
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build(), HttpStatus.BAD_REQUEST);
    }
}
