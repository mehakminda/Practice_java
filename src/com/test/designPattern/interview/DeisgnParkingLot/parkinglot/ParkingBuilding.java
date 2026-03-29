package com.test.designPattern.interview.DeisgnParkingLot.parkinglot;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;
import com.test.designPattern.interview.DeisgnParkingLot.Entity.Vehicle;
import com.test.designPattern.interview.DeisgnParkingLot.Ticket;
import com.test.designPattern.interview.DeisgnParkingLot.pricing.CostComputation;

import java.util.List;

public class ParkingBuilding {
    private final List<ParkingLevel> levels;

    public ParkingBuilding(List<ParkingLevel> levels) {
        this.levels = levels;
    }

    Ticket allocate(Vehicle vehicle) throws RuntimeException, IllegalAccessException {
        System.out.println(" Searching for parking spot for "+vehicle.getVehicleNumber());
        for(ParkingLevel level:levels){
            if(level.hasAvailability((vehicle.getVehicleType()))){
                ParkingSpot spot=level.park(vehicle.getVehicleType());
                if(spot !=null){
                    Ticket ticket=new Ticket(vehicle,level,spot);
                    System.out.println("Parking allocated at level: " + level.getLevelNumber() + " spot: " +spot.getSpotId());
                    return ticket;
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }

    public void  release (Ticket ticket){
        ticket.getLevel().unPark(
                ticket.getVehicle().getVehicleType()
                ,ticket.getSpot()
        );
    }
}
