package com.bootcamp.springivpraticablog.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdAlreadyRegisteredException extends RuntimeException {
    public IdAlreadyRegisteredException(String message) {
        super(message);
    }
}
