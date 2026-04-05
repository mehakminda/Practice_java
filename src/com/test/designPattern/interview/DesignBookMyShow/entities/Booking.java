package com.test.designPattern.interview.DesignBookMyShow.entities;

import java.util.List;
import java.util.UUID;

public class Booking {
    private final UUID BookingID;
    private final User bookingUser;
    private final Show show;
    private final List<Integer> seatList;
    private final Payment payment;


    public Booking( User bookingUser, Show show, List<Integer> seatList, Payment payment) {
        BookingID = UUID.randomUUID();
        this.bookingUser = bookingUser;
        this.show = show;
        this.seatList = seatList;
        this.payment = payment;
    }

    public UUID getBookingID() {
        return BookingID;
    }

    public User getUser() {
        return bookingUser;
    }

    public Payment getPayment() {
        return payment;
    }
}
