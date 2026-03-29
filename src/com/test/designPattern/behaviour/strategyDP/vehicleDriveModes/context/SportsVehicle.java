package com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context;

import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies.DriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
