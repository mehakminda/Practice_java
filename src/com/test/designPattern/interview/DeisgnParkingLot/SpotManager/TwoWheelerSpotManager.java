package com.test.designPattern.interview.DeisgnParkingLot.SpotManager;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;
import com.test.designPattern.interview.DeisgnParkingLot.LookUpStrategy.ParkingSpotLookupStrategy;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager{
    public TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
  /*
     1. Maintains a list of Two Wheeler Spots only
     2. Has its own lookup strategy
     3. Has its own lock, to avoid conflicts with other spot managers
     */

}
