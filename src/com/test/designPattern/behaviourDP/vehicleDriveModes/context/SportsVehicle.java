package com.test.designPattern.behaviourDP.vehicleDriveModes.context;

import com.test.designPattern.behaviourDP.vehicleDriveModes.strategies.DriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
