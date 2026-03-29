package com.test.designPattern.behaviour.strategyDP.vehicleDriveModes;

import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context.HybridVehicle;
import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context.SportsVehicle;
import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.context.Vehicle;
import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies.EVDriveStrategy;
import com.test.designPattern.behaviour.strategyDP.vehicleDriveModes.strategies.SportsDriveStrategy;

public class Demo {
    static void main() {
        //setter injections
        /*Vehicle vehicle1=new Vehicle();
        vehicle1.setDriveStrategy(new SportsDriveStrategy());
        vehicle1.drive();

        Vehicle vehicle2=new Vehicle();
        vehicle2.setDriveStrategy(new SportsDriveStrategy());
        vehicle2.drive();*/

        //constructor injection
        Vehicle vehicle3=new SportsVehicle(new SportsDriveStrategy());
        vehicle3.drive();

        Vehicle vehicle4=new HybridVehicle(new EVDriveStrategy());
        vehicle4.drive();



    }
}
