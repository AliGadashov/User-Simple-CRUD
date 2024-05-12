package com.gadashov.usercrud.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:32 PM
 */
@Getter
public class GlobalException extends RuntimeException {
    private final HttpStatus status;

    public GlobalException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public GlobalException(String message, HttpStatus status, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

}
