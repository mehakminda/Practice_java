package com.test.designPattern.structural.bridge.solution;

public class Client {
    static void main() {
        System.out.println("======= Bridge Design Pattern - Solution Demo ======");
        LivingThings dog = new Dog(new LungsBreathing());
        LivingThings whale = new Whale(new GillBreathing());
        LivingThings tree = new Tree((new Photosynthesis()));

        dog.breathe();
        whale.breathe();
        tree.breathe();
    }
}
