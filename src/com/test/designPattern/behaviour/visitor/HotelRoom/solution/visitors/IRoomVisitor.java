package com.test.designPattern.behaviour.visitor.HotelRoom.solution.visitors;


import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.DeluxeRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.StandardRoom;
import com.test.designPattern.behaviour.visitor.HotelRoom.solution.elements.SuiteRoom;

// Visitor interface - defines operations
public interface IRoomVisitor {
    void visitStandardRoom(StandardRoom room);
    void visitDeluxeRoom(DeluxeRoom room);
    void visitSuiteRoom(SuiteRoom room);
}
