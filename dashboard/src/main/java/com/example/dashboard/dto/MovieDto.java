package com.example.dashboard.dto;

import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieDto {

    private Long movieId;

    @NotBlank(message = "Please provide movie's title!")
    private String title;

    @NotBlank(message = "Please provide movie's title!")
    private String director;

    @NotBlank(message = "Please provide movie's studio!")
    private String studio;

    @ElementCollection
    @NotBlank(message = "Please provide movie's movieCast!")
    private Set<String> movieCast;

    @NotBlank(message = "Please provide movie's releaseYear!")
    private Integer releaseYear;

    @NotBlank(message = "Please provide movie's poster!")
    private String poster;

    @NotBlank(message = "Please provide movie's url!")
    private String posterUrl;

    public MovieDto(Long movieId, String title, String director, String studio, Set<String> movieCast, Integer releaseYear, String poster, String posterUrl) {
        this.movieId = movieId;
        this.title = title;
        this.director = director;
        this.studio = studio;
        this.movieCast = movieCast;
        this.releaseYear = releaseYear;
        this.poster = poster;
        this.posterUrl = posterUrl;
    }
}