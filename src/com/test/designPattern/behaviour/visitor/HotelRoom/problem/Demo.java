package com.test.designPattern.behaviour.visitor.HotelRoom.problem;

public class Demo {
    static void main() {

        System.out.println("##### Visitor Pattern: Problem Demo #####");
        SuiteHotelRoom room = new SuiteHotelRoom("112211","100");

        room.clean();
        room.deliverRoomService("200");
        room.calculatePrice();
    }
}
