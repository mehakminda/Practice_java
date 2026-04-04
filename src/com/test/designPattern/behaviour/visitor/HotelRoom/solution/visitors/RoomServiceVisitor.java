package com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors;

import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.DeluxeRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.StandardRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.SuiteRoom;

// Concrete Visitor - demonstrates adding new operations easily
public class RoomServiceVisitor implements IRoomVisitor{

    private final String orderDetails;

    public RoomServiceVisitor(String orderDetails) {
        this.orderDetails = orderDetails;
    }


    @Override
    public void visitStandardRoom(StandardRoom room) {
        System.out.println("Room Service: Delivering "+orderDetails+" to standard room "
                +room.getRoomNumber());
    }

    @Override
    public void visitDeluxeRoom(DeluxeRoom room) {
        System.out.println("Room Service: Premium delivery of "+orderDetails+
                "to deluxe room"+room.getRoomNumber()+
                "with complimentary champagne");

    }

    @Override
    public void visitSuiteRoom(SuiteRoom room) {
        System.out.println("Room Service: VIP delivery of " + orderDetails +
                " to suite " + room.getRoomNumber() +
                " with full dining setup");


    }
}
