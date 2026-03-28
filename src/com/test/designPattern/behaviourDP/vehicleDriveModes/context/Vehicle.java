package com.test.designPattern.behaviourDP.vehicleDriveModes.context;

import com.test.designPattern.behaviourDP.vehicleDriveModes.strategies.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){ //constrcutor injection
        this.driveStrategy=driveStrategy;
    }

    //setter injection
   /* public void setDriveStrategy(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }*/


    public void drive(){
        System.out.print("\n"+ this.getClass().getSimpleName()+" : ");
        driveStrategy.drive();
    }


}
