package com.example.dashboard.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "username", nullable = false, unique = true)
    @NotBlank(message = "Please enter the user's username")
    private String username;

    @Column(name = "password", nullable = false, length = 30)
    @NotBlank(message = "Please enter the user's password")
    private String password;

    @Column(name = "firstName", nullable = false, length = 30)
    @NotBlank(message = "Please enter the user's first name")
    private String firstName;

    @Column(name = "lastName", nullable = false, length = 30)
    @NotBlank(message = "Please enter the user's last name")
    private String lastName;

    @Column(name = "dob", nullable = false)
    @Past(message = "Date of birth must be in the past")
    private LocalDate dob;

    public Customer() {
    }

    public Customer(String username, String password, String firstName, String lastName, LocalDate dob) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
}
