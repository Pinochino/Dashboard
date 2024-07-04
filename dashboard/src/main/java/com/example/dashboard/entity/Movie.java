package com.example.dashboard.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide movie's title!")
    private String title;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Please provide movie's title!")
    private String director;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Please provide movie's studio!")
    private String studio;

    @ElementCollection
    @NotBlank(message = "Please provide movie's movieCast!")
    private Set<String> movieCast;

    @NotBlank(message = "Please provide movie's releaseYear!")
    private Integer releaseYear;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Please provide movie's poster!")
    private String poster;

    public Movie() {
    }

    public Movie(@NotBlank(message = "Please provide movie's title!") String title,
            @NotBlank(message = "Please provide movie's title!") String director,
            @NotBlank(message = "Please provide movie's studio!") String studio,
            @NotBlank(message = "Please provide movie's movieCast!") Set<String> movieCast,
            @NotBlank(message = "Please provide movie's releaseYear!") Integer releaseYear,
            @NotBlank(message = "Please provide movie's poster!") String poster) {
        this.title = title;
        this.director = director;
        this.studio = studio;
        this.movieCast = movieCast;
        this.releaseYear = releaseYear;
        this.poster = poster;
    }

}
