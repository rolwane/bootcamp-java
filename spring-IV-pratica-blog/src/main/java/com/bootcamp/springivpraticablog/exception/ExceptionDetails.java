package com.bootcamp.springivpraticablog.exception;

import lombok.*;

@Getter
@Setter
@Builder
public class ExceptionDetails {
    private int status;
    private String error;
    private String message;
}
