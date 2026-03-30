package com.test.designPattern.creational.factory.factoryMethod.factory;

import com.test.designPattern.creational.factory.simpleFactory.component.Circle;
import com.test.designPattern.creational.factory.simpleFactory.component.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
