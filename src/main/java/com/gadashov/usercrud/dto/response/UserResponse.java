package com.gadashov.usercrud.dto.response;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Value;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:05 PM
 */
@Value
@Builder
public class UserResponse {

    Long id;

    String name;

    String surname;

    String phone;

    String email;

}
