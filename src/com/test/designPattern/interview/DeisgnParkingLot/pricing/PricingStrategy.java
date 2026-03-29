package com.test.designPattern.interview.DeisgnParkingLot.pricing;

import com.test.designPattern.interview.DeisgnParkingLot.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
