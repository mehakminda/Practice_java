package com.test.designPattern.interview.DeisgnParkingLot;

import com.test.designPattern.interview.DeisgnParkingLot.Entity.ParkingSpot;
import com.test.designPattern.interview.DeisgnParkingLot.Entity.Vehicle;
import com.test.designPattern.interview.DeisgnParkingLot.LookUpStrategy.ParkingSpotLookupStrategy;
import com.test.designPattern.interview.DeisgnParkingLot.LookUpStrategy.RandomLookupStrategy;
import com.test.designPattern.interview.DeisgnParkingLot.SpotManager.FourWheelerSpotManager;
import com.test.designPattern.interview.DeisgnParkingLot.SpotManager.ParkingSpotManager;
import com.test.designPattern.interview.DeisgnParkingLot.SpotManager.TwoWheelerSpotManager;
import com.test.designPattern.interview.DeisgnParkingLot.enums.VehicleType;
import com.test.designPattern.interview.DeisgnParkingLot.parkinglot.*;
import com.test.designPattern.interview.DeisgnParkingLot.payment.CashPayment;
import com.test.designPattern.interview.DeisgnParkingLot.payment.UPIPyment;
import com.test.designPattern.interview.DeisgnParkingLot.pricing.CostComputation;
import com.test.designPattern.interview.DeisgnParkingLot.pricing.FixedPricingStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    static void main() throws IllegalAccessException {
        ParkingSpotLookupStrategy strategy=new RandomLookupStrategy();

        Map<VehicleType, ParkingSpotManager> levelOneManager =new HashMap<>();
        levelOneManager.put(VehicleType.TWO_WHEELER,new TwoWheelerSpotManager(List.of(new ParkingSpot("L1-S1"), new ParkingSpot("L1-S2")),strategy));
        levelOneManager.put(VehicleType.FOUR_WHEELER, new FourWheelerSpotManager(List.of(new ParkingSpot("L1-S3")),strategy));

        Map<VehicleType, ParkingSpotManager> leveltwoManager =new HashMap<>();
        leveltwoManager.put(VehicleType.TWO_WHEELER,new TwoWheelerSpotManager(List.of(new ParkingSpot("L2-S1")),strategy));
        leveltwoManager.put(VehicleType.FOUR_WHEELER, new FourWheelerSpotManager(List.of(new ParkingSpot("L2-S2"),new ParkingSpot("L2-S3")),strategy));

        ParkingLevel level1 =new ParkingLevel(1,levelOneManager);
        ParkingLevel level2=new ParkingLevel(2,leveltwoManager);

        ParkingBuilding parkingBuilding=new ParkingBuilding(List.of(level1,level2));

        ParkingLot parkingLot=new ParkingLot(parkingBuilding, new EntranceGate(), new ExitGate(new CostComputation(new FixedPricingStrategy())));

        Vehicle bike= new Vehicle("BIKE-101", VehicleType.TWO_WHEELER);
        Vehicle car= new Vehicle("CAR-201", VehicleType.FOUR_WHEELER);

/*        Vehicle bike2= new Vehicle("BIKE-102", VehicleType.TWO_WHEELER);
        Vehicle car2= new Vehicle("CAR-202", VehicleType.FOUR_WHEELER);

        Vehicle bike3= new Vehicle("BIKE-103", VehicleType.TWO_WHEELER);
        Vehicle car3= new Vehicle("CAR-203", VehicleType.FOUR_WHEELER);

        Vehicle bike4= new Vehicle("BIKE-104", VehicleType.TWO_WHEELER);
        Vehicle car4= new Vehicle("CAR-204", VehicleType.FOUR_WHEELER);*/

        Ticket t1 = parkingLot.vehicleArrives(bike);
        Ticket t2 = parkingLot.vehicleArrives(car);

 /*       Ticket t3 = parkingLot.vehicleArrives(bike2);
        Ticket t4 = parkingLot.vehicleArrives(car2);

        Ticket t5 = parkingLot.vehicleArrives(bike3);
        Ticket t6 = parkingLot.vehicleArrives(car3);

        Ticket t7 = parkingLot.vehicleArrives(bike4);
        Ticket t8 = parkingLot.vehicleArrives(car4);
*/


        parkingLot.vehicleExits(t1, new UPIPyment());
        parkingLot.vehicleExits(t2, new CashPayment());


    }
}
