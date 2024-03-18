package com.capstone.project.movieappbackend.services;

/*
 * Create MobieServiceImPL class that implements MovieService interface
 * Add @Service annotation
 * Add @Autowired annotation to inject MovieRepository
 * Add @Override annotation to the methods
 * Implement the getMoviesList method to return all movies
 * Implement the getMovieById method to return a movie based on the provided movie ID
 * Use the findById method of the MovieRepository to find a movie by its ID
 * Use the findAll method of the MovieRepository to return all movies
 * Use logger to log the method calls and error messages
 */

import java.util.List;
import java.util.Optional;

import com.capstone.project.movieappbackend.model.Movie;
import com.capstone.project.movieappbackend.repository.MovieRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getMoviesList() {
        logger.info("Fetching all movies");
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(String movieId) {
        logger.info("Fetching movie with ID: {}", movieId);
        Optional<Movie> movie = movieRepository.findById(movieId);
        if (movie.isPresent()) {
            return movie.get();
        } else {
            logger.error("Movie with ID: {} not found", movieId);
            return null;
        }
    }
}

