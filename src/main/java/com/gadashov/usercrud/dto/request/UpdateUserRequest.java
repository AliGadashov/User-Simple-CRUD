package com.gadashov.usercrud.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:05 PM
 */
@Value
public class UpdateUserRequest {

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
