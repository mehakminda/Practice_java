package com.test.designPattern.interview.DeisgnParkingLot.SpotManager;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;
import com.test.designPattern.interview.DeisgnParkingLot.LookUpStrategy.ParkingSpotLookupStrategy;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager {


    /*
     1. Maintains a list of Four Wheeler Spots only
     2. Has its own lookup strategy
     3. Has its own lock, to avoid conflicts with other spot managers
     */


    public FourWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}
