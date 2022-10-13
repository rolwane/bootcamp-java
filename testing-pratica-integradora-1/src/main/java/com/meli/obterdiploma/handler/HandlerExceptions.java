package com.meli.obterdiploma.handler;

import com.meli.obterdiploma.exception.ExceptionDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class HandlerExceptions extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders httpHeaders,
            HttpStatus httpStatus,
            WebRequest webRequest
    ) {
        List<FieldError> errors = ex.getBindingResult().getFieldErrors();

        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .status(httpStatus.value())
                .title("Parâmetros inválidos.")
                .message(ex.getMessage())
                .build();

        return new ResponseEntity<>(exceptionDetails, httpStatus);
    }
}
