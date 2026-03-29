package com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context;

import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies.DriveStrategy;

public class GoodVehicle extends Vehicle{
    public GoodVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
