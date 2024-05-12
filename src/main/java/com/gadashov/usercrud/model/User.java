package com.gadashov.usercrud.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Author: Ali Gadashov
 * Version: v1.0
 * Date: 5/12/2024
 * Time: 4:04 PM
 */
@Entity
@Table(name = "user_")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

    private String password;

}
