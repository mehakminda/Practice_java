package com.test.designPattern.creational.factory.simpleFactory.factory;

import com.test.designPattern.creational.factory.simpleFactory.component.Circle;
import com.test.designPattern.creational.factory.simpleFactory.component.Shape;
import com.test.designPattern.creational.factory.simpleFactory.component.Square;

public class ShapeFactory {
    public static Shape createShapeInstance(ShapeType shapeType) throws IllegalAccessException {
        if(shapeType == null){
            return null;
        }
        return switch(shapeType){
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            default -> throw new IllegalAccessException("ShapeType doesnt exists");
        };
    }
}

/**
 * Violates Single responsibility principle and open close principal
 * causes class explosion if the creation of object is not an easy
 */
