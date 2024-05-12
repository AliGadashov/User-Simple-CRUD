package com.gadashov.usercrud.repository;

import com.gadashov.usercrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:05 PM
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
