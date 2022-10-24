package com.bootcamp.storage02.exception;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class ExceptionDetails {
    private int status;
    private String title;
    private String message;
    private LocalDateTime timestamp;
}
