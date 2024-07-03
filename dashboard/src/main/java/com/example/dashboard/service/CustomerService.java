package com.example.dashboard.service;

import com.example.dashboard.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

List<Customer> getAllCustomers();
Customer getCustomerById(int id);
Customer save(Customer customer);
Customer saveAndFlush(Customer customer);

void delete(Integer id);
}