package com.test.designPattern.behaviourDP.paymentMethods.strategies;

public class UPIPayment implements PaymentStrategy {
    private String upiId;

    UPIPayment(String upiID){
        this.upiId=upiID;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount "+amount+" using UPI Id "+upiId);
    }
}
