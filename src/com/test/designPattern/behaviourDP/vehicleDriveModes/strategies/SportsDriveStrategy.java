package com.test.designPattern.behaviourDP.vehicleDriveModes.strategies;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}
