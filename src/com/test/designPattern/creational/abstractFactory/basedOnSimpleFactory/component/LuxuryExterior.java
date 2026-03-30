package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component;

public class LuxuryExterior implements CarExterior{
    @Override
    public void addComponent() {
        System.out.println("Alloy wheels of LuxuryExterior car");
    }
}
