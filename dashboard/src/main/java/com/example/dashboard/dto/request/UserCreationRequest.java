package com.example.dashboard.dto.request;


import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreationRequest {

    @Size(message = "USER_INVALID", min = 10)
    private String username;

    @Size(message = "PASSWORD_INVALID", min = 8)
    private String password;

    private String firstName;
    private String lastName;
    private LocalDate dob;

}