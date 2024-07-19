package com.example.dashboard.Service.User;

import com.example.dashboard.Exception.AppException;
import com.example.dashboard.Exception.ErrorCode;
import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.dto.request.UserUpdateRequest;
import com.example.dashboard.entity.Customer;
import com.example.dashboard.mapper.UserMapper;
import com.example.dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<Customer> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Customer getUserById(UUID Id) {
        return userRepository.findById(Id).orElseThrow(() -> new RuntimeException("Not found user by id: " + Id));
    }

    @Override
    public Customer createUser(UserCreationRequest request) {
        if (userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);

        Customer user = userMapper.toCustomer(request);

        return userRepository.save(user);
    }

    @Override
    public Customer updateUser(UserUpdateRequest request, UUID id) {
        Customer customer = getUserById(id);
        userMapper.updateCustomer(customer, request);
        return userRepository.save(customer);
    }


    @Override
    public void deleteUserById(UUID Id) {
         userRepository.deleteById(Id);
    }
}