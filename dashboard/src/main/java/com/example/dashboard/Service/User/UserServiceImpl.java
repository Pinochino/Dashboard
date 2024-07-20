package com.example.dashboard.Service.User;

import com.example.dashboard.Exception.AppException;
import com.example.dashboard.Exception.ErrorCode;
import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.dto.response.UserResponse;
import com.example.dashboard.entity.Customer;
import com.example.dashboard.mapper.UserMapper;
import com.example.dashboard.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
     UserRepository userRepository;
      UserMapper userMapper;

    @Override
    public List<Customer> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserResponse getUserById(UUID Id) {
        return userMapper.toUserResponse(userRepository.findById(Id).orElseThrow(() -> new RuntimeException("Not found user by id: " + Id)));
    }

    @Override
    public Customer createUser(UserCreationRequest request) {
        if (userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);

        Customer user = userMapper.toCustomer(request);

        return userRepository.save(user);
    }

    @Override
    @Transactional
    public UserResponse updateUser(UUID id, UserUpdateRequest request) {
        Customer customer = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (customer == null) {
            throw new RuntimeException("Customer not found with id: " + id);
        }
        System.out.println("Before update " + customer);
        userMapper.updateCustomer(customer, request);

        System.out.println("After update " + customer);
        return userMapper.toUserResponse(userRepository.save(customer));
    }


    @Override
    @Transactional
    public void deleteUserById(UUID Id) {
         userRepository.deleteById(Id);
    }
}