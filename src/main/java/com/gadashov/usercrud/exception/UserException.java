package com.gadashov.usercrud.exception;

import org.springframework.http.HttpStatus;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:31 PM
 */

public class UserException extends GlobalException {

    public UserException(String message, HttpStatus status) {
        super(message, status);
    }

    public UserException(String message, HttpStatus status, Throwable cause) {
        super(message, status, cause);
    }
}

