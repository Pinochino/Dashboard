package com.example.dashboard.dto;

import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class MovieDTO {

    private Long Id;

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

}