package com.test.designPattern.behaviourDP.vehicleDriveModes.strategies;

public class NormalDriverStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving Capability: Normal");
    }
}
