package com.gadashov.usercrud.service;

import com.gadashov.usercrud.dto.request.CreateUserRequest;
import com.gadashov.usercrud.dto.request.UpdateUserRequest;
import com.gadashov.usercrud.dto.response.UserResponse;

import java.util.List;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:06 PM
 */

public interface UserService {
    void createUser(CreateUserRequest request);
    void updateUser(Long userId, UpdateUserRequest request);
    void deleteUser(Long userId);
    UserResponse getUserById(Long userId);
    List<UserResponse> getAllUser();

}
