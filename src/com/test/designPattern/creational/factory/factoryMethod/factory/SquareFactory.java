package com.test.designPattern.creational.factory.factoryMethod.factory;


import com.test.designPattern.creational.factory.factoryMethod.component.Shape;
import com.test.designPattern.creational.factory.factoryMethod.component.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
