package com.example.dashboard.dto.request;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public class UserUpdateRequest {

    @Size(message = "PASSWORD_INVALID", min = 8)
    private String password;

    private String firstName;
    private String lastName;
    private LocalDate dob;
}
