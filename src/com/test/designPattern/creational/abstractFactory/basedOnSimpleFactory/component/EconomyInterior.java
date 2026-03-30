package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component;

public class EconomyInterior implements CarInterior{
    @Override
    public void addComponent() {
        System.out.println("Basic Seats of EconomyInterior car");
    }
}
