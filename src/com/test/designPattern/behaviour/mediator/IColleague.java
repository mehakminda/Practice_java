package com.test.designPattern.behaviour.mediator;

// Colleague Interface(aka Component Interface)
public interface IColleague {
    void placeBid(double amount);
    void recieveNotification(double bidAmount);
    String getName();

}
