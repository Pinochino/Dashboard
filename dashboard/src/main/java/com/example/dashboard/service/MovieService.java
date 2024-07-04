package com.example.dashboard.service;

import com.example.dashboard.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

List<Movie> getAllCustomers();
Movie getCustomerById(int id);
Movie save(Movie movie);
Movie saveAndFlush(Movie movie);

void delete(Integer id);
}