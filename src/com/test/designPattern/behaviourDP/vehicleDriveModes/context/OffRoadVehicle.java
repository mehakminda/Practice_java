package com.test.designPattern.behaviourDP.vehicleDriveModes.context;

import com.test.designPattern.behaviourDP.vehicleDriveModes.strategies.DriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
