package com.example.dashboard.controller;

import com.example.dashboard.Service.User.UserService;
import com.example.dashboard.dto.request.ApiResponse;
import com.example.dashboard.dto.request.UserCreationRequest;
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
    public ResponseEntity<Customer> getUserById(@PathVariable UUID id) {
        Customer user = userService.getUserById(id);
        return ResponseEntity.ok(user); // Return 200 OK with user object
    }

    @PostMapping("/user")
    public ApiResponse<Customer> createUser(@RequestBody @Valid UserCreationRequest request) {

        ApiResponse<Customer> response = new ApiResponse<>();
        response.setResult(userService.createUser(request));
        return response;
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<Customer> updateStudentById(@PathVariable UUID id, @RequestBody Customer user){
        Customer user1 =  userService.getUserById(id);
        if (user1 != null){

            user1.setFirstName(user.getFirstName());
            user1.setPassword(user.getPassword());
            user1.setLastName(user.getLastName());
            user1.setDob(user.getDob());
            user1.setUsername(user.getUsername());

            return ResponseEntity.ok(user1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable UUID id){
       userService.deleteUserById(id);
    }

}