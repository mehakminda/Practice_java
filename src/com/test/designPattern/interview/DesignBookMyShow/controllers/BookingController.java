package com.test.designPattern.interview.DesignBookMyShow.controllers;

import com.test.designPattern.interview.DesignBookMyShow.entities.Booking;
import com.test.designPattern.interview.DesignBookMyShow.entities.Show;
import com.test.designPattern.interview.DesignBookMyShow.entities.User;
import com.test.designPattern.interview.DesignBookMyShow.service.BookingService;

import java.util.List;
import java.util.UUID;

public class BookingController {
    private final BookingService bookingService;


    public BookingController() {
        this.bookingService = new BookingService();
    }

    public Booking createBooking(User user, Show show, List<Integer> seats){

        Booking booking = bookingService.book(user, show, seats);
        return booking;

    }
    public Booking getBooking(UUID bookingID){
        return bookingService.getBooking(bookingID);
    }
    public List<Booking> getBookingByUser(User user){
        return bookingService.getBookingsForUser(user);

    }
}
