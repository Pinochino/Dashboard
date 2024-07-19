package com.example.dashboard.dto.request;


import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class UserCreationRequest {

    private UUID Id;
    @Size(message = "USER_INVALID", min = 10)
    private String username;

    @Size(message = "PASSWORD_INVALID", min = 8)
    private String password;

    private String firstName;
    private String lastName;
    private LocalDate dob;

}