package com.example.dashboard.repository;

import com.example.dashboard.entity.Customer;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<Customer, UUID> {

    boolean existsByUsername(String username);

    Optional<Customer> findByUsername(String username);
}