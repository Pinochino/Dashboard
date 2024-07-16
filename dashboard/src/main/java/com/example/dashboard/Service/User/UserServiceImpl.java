package com.example.dashboard.Service.User;

import com.example.dashboard.Exception.AppException;
import com.example.dashboard.Exception.ErrorCode;
import com.example.dashboard.dto.request.UserCreationRequest;
import com.example.dashboard.entity.Customer;
import com.example.dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
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
        Customer user = new Customer();

        if (userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
    }

    @Override
    public Customer updateUser(Customer user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(UUID Id) {
         userRepository.deleteById(Id);
    }
}