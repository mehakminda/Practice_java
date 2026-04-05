package com.test.designPattern.interview.DesignBookMyShow.service;

import com.test.designPattern.interview.DesignBookMyShow.entities.Movie;
import com.test.designPattern.interview.DesignBookMyShow.entities.Screen;
import com.test.designPattern.interview.DesignBookMyShow.entities.Show;
import com.test.designPattern.interview.DesignBookMyShow.entities.Theatre;
import com.test.designPattern.interview.DesignBookMyShow.enums.City;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TheatreService {
    private final Map<City, List<Theatre>> cityTheatre =new HashMap<>();

    public void addTheatre(Theatre theatre){
        cityTheatre.computeIfAbsent(theatre.getCity(), c -> new ArrayList<>()).add(theatre);
    }

    public Set<Movie> getMovies(City city, LocalDate date) {
        Set<Movie> movies = new HashSet();
        List<Theatre> theatres = cityTheatre.getOrDefault(city, List.of());

        for(Theatre theatre : theatres ){
            for (Screen screens : theatre.getScreens()){
                for(Show show: screens.getShows(date)){
                    movies.add(show.getMovie());
                }

            }
        }
        return movies;
    }
    public List<Theatre> getTheatres(City city, Movie movie, LocalDate date){
        List<Theatre> theatres = cityTheatre.getOrDefault(city, List.of());
        return theatres.stream().filter(t -> t.getScreens().stream()
                .anyMatch(s-> s.getShows(date).stream()
                        .anyMatch(show-> show.getMovie().equals(movie)))).toList();
    }

    public List<Show> getShows(Movie movie, LocalDate date, Theatre theatre) {
        List<Show> showList = new ArrayList<>();

        for(Screen screen : theatre.getScreens()){
            for(Show show : screen.getShows(date)){
                if(show.getMovie().equals(movie)){
                    showList.add(show);
                }
            }
        }
        return showList;
    }
}
