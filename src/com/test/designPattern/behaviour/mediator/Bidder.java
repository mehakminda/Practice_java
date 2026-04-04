package com.test.designPattern.behaviour.mediator;

// Concrete Colleague/Component
public class Bidder implements IColleague{

    protected String name;
    protected AutionMediator autionMediator;

    public Bidder(String name, AutionMediator autionMediator) {
        this.name = name;
        this.autionMediator = autionMediator;
        autionMediator.registerBidder(this);
    }

    @Override
    public void placeBid(double amount) {
        autionMediator.placeBid(this, amount);

    }

    @Override
    public void recieveNotification(double bidAmount) {
        System.out.println("Bidder: "+ name + " got notification that someone has put bid for amount :" + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
