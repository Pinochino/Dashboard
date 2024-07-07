package com.example.dashboard.service;

import com.example.dashboard.dto.MovieDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public interface MovieService {

    MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;

    MovieDto getMovie(Integer movieId);

    List<MovieDto> getAllMovies();

}