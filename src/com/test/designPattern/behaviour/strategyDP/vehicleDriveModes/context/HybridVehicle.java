package com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context;

import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies.DriveStrategy;

public class HybridVehicle extends Vehicle{

    public HybridVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
