package com.test.designPattern.interview.DeisgnParkingLot.parkinglot;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.Vehicle;
import com.test.designPattern.interview.DeisgnParkingLot.Ticket;
import com.test.designPattern.interview.DeisgnParkingLot.payment.Payment;

public class ParkingLot {
    private final ParkingBuilding parkingBuilding;
    private final EntranceGate entranceGate;
    private final ExitGate exitGate;

    public ParkingLot(ParkingBuilding parkingBuilding, EntranceGate entranceGate, ExitGate exitGate) {
        this.parkingBuilding = parkingBuilding;
        this.entranceGate = entranceGate;
        this.exitGate = exitGate;
    }

    public Ticket vehicleArrives(Vehicle vehicle) {
        System.out.println(vehicle.getVehicleNumber() +" Entered the Parking lot");
        return entranceGate.enter(parkingBuilding, vehicle);
    }

    public  void vehicleExits(Ticket ticket, Payment payment){
        exitGate.completeExit(parkingBuilding,ticket, payment);
        //System.out.println("Exited through the Parking lot");
    }
}
