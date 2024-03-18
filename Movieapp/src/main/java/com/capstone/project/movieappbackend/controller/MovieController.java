package com.capstone.project.movieappbackend.controller;

/*
 * Create movie rest controller with the following endpoints:
 * use @RestController annotation
 * Use @GetMapping and @postMapping annotations
 * Use @Autowired annotation to inject the movie service
 * Use @PathVariable annotation to get the movie id from the request URL
 * Use @RequestBody annotation to get the movie object from the request body
 * Use @RequestParam annotation to get the search query from the request URL
 * Use base path as "/api/v1/movies"
 * add loggers to log the method calls and error messages
 */

import java.util.List;

import com.capstone.project.movieappbackend.model.Movie;
import com.capstone.project.movieappbackend.services.MovieService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getMoviesList() {
        logger.info("Fetching all movies");
        return movieService.getMoviesList();
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable String movieId) {
        logger.info("Fetching movie with ID: {}", movieId);
        return movieService.getMovieById(movieId);
    } 
}



