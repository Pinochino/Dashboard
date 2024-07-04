package com.example.dashboard.service;

import com.example.dashboard.DAO.MovieRepository;
import com.example.dashboard.dto.MovieDto;
import com.example.dashboard.entity.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class MovieServiceImp implements  MovieService{

    private final MovieRepository movieRepository;
    private final FileService fileService;

    public MovieServiceImp(MovieRepository movieRepository, FileService fileService) {
        this.movieRepository = movieRepository;
        this.fileService = fileService;
    }

    @Value("${project.poster}")
    private String path;

    @Override
    public MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException {
        // 1. Upload the file
        String uploadedFileName =fileService.uploadFile(path, file);

        // 2. set the value of field 'poster' as filename
        movieDto.setPoster(uploadedFileName);

        // 3. map dto to Movie object
        Movie movie = new Movie(
                movieDto.getMovieId(),
                movieDto.getTitle(),
                movieDto.getDirector(),
                movieDto.getStudio(),
                movieDto.getMovieCast(),
                movieDto.getReleaseYear(),
                movieDto.getPoster()
        );

        // 4. save the movie object -> saved Movie object
        Movie savedMovie = movieRepository.save(movie);

        // 5. generate the posterUrl


        // 6. map Movie object to DTO object and return it

        return null;
    }

    @Override
    public MovieDto getMovie(Integer movieID) {
        return null;
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return null;
    }
}
