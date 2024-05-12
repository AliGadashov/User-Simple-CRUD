package com.gadashov.usercrud.mapper;

import com.gadashov.usercrud.dto.request.CreateUserRequest;
import com.gadashov.usercrud.dto.request.UpdateUserRequest;
import com.gadashov.usercrud.dto.response.UserResponse;
import com.gadashov.usercrud.model.User;
import org.springframework.stereotype.Component;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:21 PM
 */
@Component
public class UserServiceMapper {


    public User userCreateRequestToUserEntity(CreateUserRequest request) {
        return User.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .email(request.getEmail())
                .phone(request.getPhone())
                .password(request.getPassword())
                .build();
    }

    public User userUpdateRequestToUserEntity(User user, UpdateUserRequest request) {
        if (request.getName() != null) {
            user.setName(request.getName());
        }
        if (request.getSurname() != null){
            user.setSurname(request.getSurname());
        }
        if (request.getPhone() != null){

            user.setPhone(request.getPhone());
        }
        if (request.getEmail() != null){

        user.setEmail(request.getEmail());
        }
        if (request.getPassword() != null) {
            user.setPassword(request.getPassword());
        }
        return user;
    }

    public UserResponse userEntityToUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .phone(user.getPhone())
                .email(user.getEmail())
                .build();
    }
}
