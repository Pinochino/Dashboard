package com.example.dashboard.Service.User;

import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.dto.response.UserResponse;
import com.example.dashboard.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService  {

   List<Customer> getAllUser();
   UserResponse getUserById(UUID Id);
   Customer createUser(UserCreationRequest request);

    UserResponse updateUser(UUID id, UserUpdateRequest request);

    void deleteUserById(UUID Id);
}