package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component;

public class EconomyExterior implements CarExterior{
    @Override
    public void addComponent() {
        System.out.println(" Normal Wheel of EconomyExterior car");
    }
}
