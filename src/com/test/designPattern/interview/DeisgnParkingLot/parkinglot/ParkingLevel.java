package com.test.designPattern.interview.DeisgnParkingLot.parkinglot;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;
import com.test.designPattern.interview.DeisgnParkingLot.SpotManager.ParkingSpotManager;
import com.test.designPattern.interview.DeisgnParkingLot.enums.VehicleType;

import java.util.Map;

public class ParkingLevel {
    private final int levelNumber;
    private final Map<VehicleType, ParkingSpotManager> managers;

    public ParkingLevel(int levelNumber, Map<VehicleType, ParkingSpotManager> managers) {
        this.levelNumber = levelNumber;
        this.managers = managers;
    }
    public boolean hasAvailability(VehicleType type){
        ParkingSpotManager manager= managers.get(type);
        return manager !=null && manager.hasFreeSpot();
    }
    public ParkingSpot park(VehicleType type) throws IllegalAccessException {
        ParkingSpotManager manager=managers.get(type);
        if(manager==null){
            throw new IllegalAccessException("No parking manager for vehicle type: "+type);
        }
        return manager.park();
    }
    public void unPark(VehicleType type,ParkingSpot spot){
        ParkingSpotManager manager=managers.get(type);
        if(manager!=null){
            manager.unPark(spot);
        }
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
