package com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements;

import com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors.IRoomVisitor;

public class StandardRoom implements IRoom{
    private final String roomNumber;

    public StandardRoom(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visitStandardRoom(this);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

}
