package com.test.designPattern.interview.DesignBookMyShow.entities;

import com.test.designPattern.interview.DesignBookMyShow.enums.SeatStatus;
import com.test.designPattern.interview.DesignBookMyShow.enums.SeatType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class Show {
    private final Movie movie;
    private final LocalDate showDate;
    private final LocalTime showTime;
    private final Map<Integer, SeatStatus> seatStatusMap = new HashMap<>();
    private final Map<Integer, ReentrantLock> seatLocks = new HashMap<>();

    public Show(Movie movie, Screen screen, LocalDate showDate, LocalTime showTime) {
        this.movie = movie;
        this.showDate = showDate;
        this.showTime = showTime;

        //Screen object here creates extensibility
        for(Seat seat: screen.getSeats()){
            seatStatusMap.put(seat.getSeatId(), SeatStatus.AVAILABLE);
            seatLocks.put(seat.getSeatId(), new ReentrantLock());
        }
    }

    public boolean lockSeats(List<Integer> seatIds){
        List<Integer> sorted = new ArrayList<>(seatIds);

        //sorting he seats to avoid deadlock
        Collections.sort(sorted);

        List<ReentrantLock> acquiredLocks = new ArrayList();

        try{
            //Phase1: acquiring the locked seats
            for(Integer seatID: sorted) {

                ReentrantLock lock = seatLocks.get(seatID);
                lock.lock();
                acquiredLocks.add(lock);
            }

            //Phase2 validate availability
            for(Integer seatID: sorted){
                if(seatStatusMap.get(seatID) != (SeatStatus.AVAILABLE)){
                    return false;
                }
            }

            // Phase 3: mark LOCKED
            for(Integer seatID: sorted){
                seatStatusMap.put(seatID,SeatStatus.LOCKED);
            }
        }
        finally{
            //Phase4 : release luck on acquired locks
            for(ReentrantLock lock: acquiredLocks){
               lock.unlock();
            }
        }


        return true;

    }

    public void confirmSeats(List<Integer> seatId){
        for(Integer id: seatId){
            seatStatusMap.put(id, SeatStatus.BOOKED);
        }
    }

    public void releaseSeats(List<Integer> seatIDs){
        for(Integer seatID : seatIDs){
            seatStatusMap.put(seatID,SeatStatus.AVAILABLE);
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public LocalTime getShowTime() {
        return showTime;
    }
}
