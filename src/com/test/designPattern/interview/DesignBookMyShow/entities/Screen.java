package com.test.designPattern.interview.DesignBookMyShow.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Screen {
    private final int screenID;
    private final List<Seat>  seatList;
    private final HashMap<LocalDate, List<Show>> showsBydate = new HashMap<>();

    public Screen(int screenID, List<Seat> seatList) {
        this.screenID = screenID;
        this.seatList = seatList;
    }

    public List<Seat> getSeats() {
        return seatList;
    }

    public void addShow(Show show){
        showsBydate.computeIfAbsent(show.getShowDate(), d-> new ArrayList<>()).add(show);
    }

    public void removeShow(Show show){
        showsBydate.get(show.getShowDate()).remove(show);
    }

    public List<Show> getShows(LocalDate date){
        return showsBydate.getOrDefault(date,List.of());
    }

}
