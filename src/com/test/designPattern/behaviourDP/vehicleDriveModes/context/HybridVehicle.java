package com.test.designPattern.behaviourDP.vehicleDriveModes.context;

import com.test.designPattern.behaviourDP.vehicleDriveModes.strategies.DriveStrategy;

public class HybridVehicle extends Vehicle{

    public HybridVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
