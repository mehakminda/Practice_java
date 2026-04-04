package com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements;

import com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors.IRoomVisitor;

// Element interface - represents rooms(elements) that can be visited
public interface IRoom {
    void accept(IRoomVisitor visitor);

}

