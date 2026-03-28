package com.test.designPattern.behaviourDP.vehicleDriveModes.context;

import com.test.designPattern.behaviourDP.vehicleDriveModes.strategies.DriveStrategy;

public class GoodVehicle extends Vehicle{
    public GoodVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
