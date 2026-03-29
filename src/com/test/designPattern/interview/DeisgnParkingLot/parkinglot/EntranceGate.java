package com.test.designPattern.interview.DeisgnParkingLot.parkinglot;


import com.test.designPattern.interview.DeisgnParkingLot.Entity.Vehicle;
import com.test.designPattern.interview.DeisgnParkingLot.Ticket;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle)  {
        System.out.println("Vehicle '"+vehicle.getVehicleNumber()+"' entered through Entrance gate.");
        try {
            return building.allocate(vehicle);
        } catch (RuntimeException e) {
           // System.out.println(" Cannot assign parking spot for vehicle "+vehicle.getVehicleNumber());
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
