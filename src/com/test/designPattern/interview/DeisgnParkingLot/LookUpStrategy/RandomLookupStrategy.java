package com.test.designPattern.interview.DeisgnParkingLot.LookUpStrategy;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;

import java.util.List;

public class RandomLookupStrategy implements ParkingSpotLookupStrategy{

    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> spots) {
        for(ParkingSpot spot:spots){
            if(spot.isSpotFree()){
                return spot;
            }
        }
        return null;
    }
}
