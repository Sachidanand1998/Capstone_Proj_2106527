package com.capstone.project.movieappbackend.services;

// Create a service interface for the movie with the following methods: getMoviesList, getMovieById

import java.util.List;

import com.capstone.project.movieappbackend.model.Movie;

public interface MovieService {
    /**
     * Returns a list of all movies.
     *
     * @return a list of all movies
     */
    public List<Movie> getMoviesList();

    /**
     * Returns a movie based on the provided movie ID.
     *
     * @param movieId the ID of the movie to be returned
     * @return the movie with the provided ID
     */
    public Movie getMovieById(String movieId);
}
