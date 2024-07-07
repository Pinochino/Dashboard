package com.example.dashboard.controller;

import com.example.dashboard.dto.MovieDto;
import com.example.dashboard.service.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/addMovie")
    public ResponseEntity<MovieDto> addMovieHandler(@RequestPart MultipartFile file,
                                                    @RequestPart String movieDto
                                                    ) throws IOException {
        MovieDto dto = convertToMovieDto(movieDto);
        return  new ResponseEntity<>(movieService.addMovie(dto, file), HttpStatus.CREATED);
    }

    private MovieDto convertToMovieDto(String movieDtoObj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(movieDtoObj, MovieDto.class);
    }
}
