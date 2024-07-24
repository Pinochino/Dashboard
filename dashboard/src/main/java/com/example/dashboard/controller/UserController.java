package com.example.dashboard.controller;

import com.example.dashboard.Service.User.UserService;
import com.example.dashboard.dto.response.ApiResponse;
import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.dto.response.UserResponse;
import com.example.dashboard.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Customer> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable UUID id) {
        UserResponse user = userService.getUserById(id);
        return ResponseEntity.ok(user); // Return 200 OK with user object
    }

    @PostMapping("/user")
    public ApiResponse<Customer> createUser(@RequestBody @Valid UserCreationRequest request) {

        ApiResponse<Customer> response = new ApiResponse<>();
        response.setResult(userService.createUser(request));
        return response;
    }

    @PutMapping("/user/{id}")
    public UserResponse updateStudentById(@PathVariable UUID id, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(id, request);
    }


    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable UUID id){
       userService.deleteUserById(id);
    }

}
