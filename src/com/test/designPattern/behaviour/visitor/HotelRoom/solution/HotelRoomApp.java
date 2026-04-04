package com.test.designPattern.behaviour.visitor.HotelRoom.solution;

import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.DeluxeRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.IRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.StandardRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.SuiteRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors.HousekeepingVisitor;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors.IRoomVisitor;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors.PricingVisitor;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors.RoomServiceVisitor;

public class HotelRoomApp {
    static void main() {
        System.out.println("\n###### Visitor Design Pattern Demo ######");

        // Create different room types(elements) - Standard, Deluxe, Suite
        IRoom[] rooms = {
                new StandardRoom("101"),
                new DeluxeRoom("201", true),
                new SuiteRoom("301", 3),
                new StandardRoom("102"),
                new DeluxeRoom("202", false)
        };

        // Calling Visitors on elements
        System.out.println("\n==> Housekeeping Service");
        IRoomVisitor housekeeping = new HousekeepingVisitor();
        for (IRoom room : rooms) {
            room.accept(housekeeping);
        }

        System.out.println("\n==> Room Service");
        IRoomVisitor roomService = new RoomServiceVisitor("Breakfast");
        rooms[0].accept(roomService);  // Deliver to standard room
        rooms[1].accept(roomService);  // Deliver to deluxe room
        rooms[2].accept(roomService);  // Deliver to suite

        System.out.println("\n==> Revenue Calculation");
        PricingVisitor pricing = new PricingVisitor();
        for (IRoom room : rooms) {
            room.accept(pricing);
        }
        System.out.println("Total Revenue: Rs." + pricing.getTotalRevenue());

    }
}
