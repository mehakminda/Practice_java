package com.test.designPattern.structural.facade;

public class ECommerceApp {
    static void main() {
        System.out.println("====== Facade Design Pattern Demo ======");
        // Client interacts with a simple Facade, not with all subsystems.
        OrderFacade orderFacade = new OrderFacade();

        // Place order with one call to Facade
        orderFacade.placeOrder("MacBook Pro", "Credit Card");

        // Place another order with one call to Facade
        orderFacade.placeOrder("Cricket Bat", "UPI");

    }
}
