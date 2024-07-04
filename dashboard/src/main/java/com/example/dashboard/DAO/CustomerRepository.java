package com.example.dashboard.DAO;

import com.example.dashboard.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Movie, Long> {
}