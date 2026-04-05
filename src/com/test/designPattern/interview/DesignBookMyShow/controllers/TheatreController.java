package com.test.designPattern.interview.DesignBookMyShow.controllers;

import com.test.designPattern.interview.DesignBookMyShow.entities.Movie;
import com.test.designPattern.interview.DesignBookMyShow.entities.Show;
import com.test.designPattern.interview.DesignBookMyShow.entities.Theatre;
import com.test.designPattern.interview.DesignBookMyShow.enums.City;
import com.test.designPattern.interview.DesignBookMyShow.service.TheatreService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public class TheatreController {
    private final TheatreService theatreService;

    public TheatreController() {
        this.theatreService = new TheatreService();
    }

    public void addThreatre(Theatre theatre){
        theatreService.addTheatre(theatre);
    }
    public Set<Movie> getMovies(City city, LocalDate date){
        return theatreService.getMovies(city, date);
    }
    public List<Theatre> getThreatre(City city, Movie movie, LocalDate date){
        return theatreService.getTheatres(city, movie, date);
    }
    public List<Show> getShows(Theatre theatre, LocalDate date, Movie movie){
        return theatreService.getShows(movie, date, theatre);
    }
}
