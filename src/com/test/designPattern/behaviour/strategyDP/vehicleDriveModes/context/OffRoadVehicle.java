package com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context;

import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies.DriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
