package com.test.designPattern.behaviourDP.vehicleDriveModes.strategies;

public class EVDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric");
    }
}
