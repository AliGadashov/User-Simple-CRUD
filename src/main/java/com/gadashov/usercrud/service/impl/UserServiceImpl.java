package com.gadashov.usercrud.service.impl;

import com.gadashov.usercrud.dto.request.CreateUserRequest;
import com.gadashov.usercrud.dto.request.UpdateUserRequest;
import com.gadashov.usercrud.dto.response.UserResponse;
import com.gadashov.usercrud.exception.UserException;
import com.gadashov.usercrud.mapper.UserServiceMapper;
import com.gadashov.usercrud.model.User;
import com.gadashov.usercrud.repository.UserRepository;
import com.gadashov.usercrud.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:06 PM
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserServiceMapper userServiceMapper;

    public UserServiceImpl(UserRepository userRepository, UserServiceMapper userServiceMapper) {
        this.userRepository = userRepository;
        this.userServiceMapper = userServiceMapper;
    }

    @Override
    public void createUser(CreateUserRequest request) {
        User user = userServiceMapper.userCreateRequestToUserEntity(request);
        userRepository.save(user);
    }

    @Override
    public void updateUser(Long userId, UpdateUserRequest request) {

        User user = findById(userId);

        User updatedUser = userServiceMapper.userUpdateRequestToUserEntity(user, request);
        userRepository.save(updatedUser);

    }

    @Override
    public void deleteUser(Long userId) {

        userRepository.delete(findById(userId));

    }

    @Override
    public UserResponse getUserById(Long userId) {
        User user = findById(userId);

        return userServiceMapper.userEntityToUserResponse(user);
    }

    @Override
    public List<UserResponse> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream().map(userServiceMapper::userEntityToUserResponse).toList();
    }

    private User findById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserException("User not found with id: " + userId, HttpStatus.NOT_FOUND));
    }
}
