package com.example.dashboard.Service.User;

import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService  {

   List<Customer> getAllUser();
   Customer getUserById(UUID Id);
   Customer createUser(UserCreationRequest request);
   Customer updateUser(Customer user);

   void deleteUserById(UUID Id);
}