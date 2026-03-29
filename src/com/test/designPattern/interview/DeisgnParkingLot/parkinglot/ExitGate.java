package com.test.designPattern.interview.DeisgnParkingLot.parkinglot;

import com.test.designPattern.interview.DeisgnParkingLot.Ticket;
import com.test.designPattern.interview.DeisgnParkingLot.payment.Payment;
import com.test.designPattern.interview.DeisgnParkingLot.pricing.CostComputation;

public class ExitGate {
    private final CostComputation costComputation;


    public ExitGate(CostComputation costComputation) {
        this.costComputation = costComputation;
    }

    private double calculatePrice(Ticket ticket){
        return costComputation.compute(ticket);
    }

    public void completeExit(ParkingBuilding building,Ticket ticket, Payment payment){
        double amount=calculatePrice(ticket);
        boolean success=payment.pay(amount);

        if(!success){
            throw new RuntimeException("Payment failed Exit denied");
        }
        building.release(ticket);
        System.out.println("Exit Successfully. Gate opened");
    }
}
