package com.test.designPattern.interview.DeisgnParkingLot.pricing;

import com.test.designPattern.interview.DeisgnParkingLot.Ticket;

public class FixedPricingStrategy implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}
