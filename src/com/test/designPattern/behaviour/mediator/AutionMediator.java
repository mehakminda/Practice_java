package com.test.designPattern.behaviour.mediator;

//Mediator Interface
public interface AutionMediator {
    void registerBidder(IColleague bidder);
    void placeBid(IColleague bidder, double bidAmount);
    void closeAuction();

}
