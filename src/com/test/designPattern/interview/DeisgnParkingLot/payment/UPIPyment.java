package com.test.designPattern.interview.DeisgnParkingLot.payment;

public class UPIPyment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("UPI paid: "+amount);
        return true;
    }
}
