package com.test.designPattern.interview.DeisgnParkingLot.pricing;

import com.test.designPattern.interview.DeisgnParkingLot.Ticket;

public class CostComputation {

    private final PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket){
        return pricingStrategy.calculate(ticket);
    }
}
