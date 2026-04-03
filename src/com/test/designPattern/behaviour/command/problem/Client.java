package com.test.designPattern.behaviour.command.problem;

public class Client {
    static void main() {

        System.out.println("##### Command Pattern: Problem Demo #####");

        // Device: Air Conditioner Commands
        AcConditioner ac = new AcConditioner();
        ac.turnOn();
        ac.setTemperature(25);
        ac.turnOff();

        // Device: Bulb Commands
        Bulb bulb = new Bulb();
        bulb.turnOn();
        bulb.turnOff();
    }
}