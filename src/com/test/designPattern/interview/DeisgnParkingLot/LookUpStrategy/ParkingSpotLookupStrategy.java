package com.test.designPattern.interview.DeisgnParkingLot.LookUpStrategy;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}
