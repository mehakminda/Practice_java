package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory;

import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.component.CarInterior;
import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.factory.CarFactoryProducer;
import com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.factory.InteriorFactory;

public class Client {
    static void main() {
        InteriorFactory interiorFactory=(InteriorFactory) CarFactoryProducer.getFactory("interior");
        CarInterior interior = interiorFactory.getInterior("luxury");
        interior.addComponent();
    }
}
//factories of factory
// I have 2 factory: exterior factory and interior factory