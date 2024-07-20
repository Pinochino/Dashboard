package com.example.dashboard.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
     UUID id;

    @Column(name = "username", nullable = false, unique = true)
    @NotBlank(message = "Please enter the user's username")
     String username;

    @Column(name = "password", nullable = false, length = 30)
    @NotBlank(message = "Please enter the user's password")
     String password;

    @Column(name = "firstName", nullable = false, length = 30)
    @NotBlank(message = "Please enter the user's first name")
     String firstName;

    @Column(name = "lastName", nullable = false, length = 30)
    @NotBlank(message = "Please enter the user's last name")
     String lastName;

    @Column(name = "dob", nullable = false)
    @Past(message = "Date of birth must be in the past")
     LocalDate dob;

    public Customer() {
    }

}
