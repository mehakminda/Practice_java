package com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies;

public class EVDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric");
    }
}
