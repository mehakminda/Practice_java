package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component;

public class LuxuryInterior implements CarInterior{
    @Override
    public void addComponent() {
        System.out.println("Premium Seats of LuxuryInterior car ");
    }
}
