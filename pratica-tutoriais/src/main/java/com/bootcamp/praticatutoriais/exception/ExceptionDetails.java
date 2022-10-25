package com.bootcamp.praticatutoriais.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ExceptionDetails {
    private int status;
    private String title;
    private String message;
    private LocalDateTime timestamp;
}
