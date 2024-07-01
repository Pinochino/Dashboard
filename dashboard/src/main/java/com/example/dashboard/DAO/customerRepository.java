package com.example.dashboard.DAO;

import com.example.dashboard.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepository extends JpaRepository<Customer, Long> {
}