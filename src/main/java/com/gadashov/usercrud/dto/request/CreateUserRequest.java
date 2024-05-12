package com.gadashov.usercrud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.time.LocalDate;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:05 PM
 */

@Value
public class CreateUserRequest {
    @NotBlank
    String name;
    @NotBlank
    String surname;
    @NotBlank
    String phone;
    @NotBlank
    String email;
    @NotBlank
    String password;
}
