package com.test.designPattern.Interview.designParkingLot.lookupStrategy;

import com.test.designPattern.Interview.designParkingLot.entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookUpStrategy
{
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}
