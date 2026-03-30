package com.test.designPattern.creational.factory.factoryMethod.factory;

import com.test.designPattern.creational.factory.simpleFactory.component.Circle;
import com.test.designPattern.creational.factory.simpleFactory.component.Shape;
import com.test.designPattern.creational.factory.simpleFactory.component.Square;

public abstract class ShapeFactory {
    public abstract Shape createShape() ;
}

