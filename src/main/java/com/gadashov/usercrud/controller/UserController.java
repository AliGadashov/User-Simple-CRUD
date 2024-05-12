package com.gadashov.usercrud.controller;

import com.gadashov.usercrud.dto.request.CreateUserRequest;
import com.gadashov.usercrud.dto.request.UpdateUserRequest;
import com.gadashov.usercrud.dto.response.UserResponse;
import com.gadashov.usercrud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:06 PM
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request){
        userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully!");
    }
    @PutMapping("/{userId}")
    public ResponseEntity<String>  updateUser(@PathVariable Long userId,
                                            @RequestBody UpdateUserRequest request){
        userService.updateUser(userId,request);


        return ResponseEntity.ok().body("User updated successfully!");
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<String>  deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok().body("User deleted successfully!");
    }
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long userId){
        UserResponse userById = userService.getUserById(userId);
        return ResponseEntity.ok(userById);
    }
    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUser(){
        List<UserResponse> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

}
