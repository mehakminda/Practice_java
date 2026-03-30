package com.test.designPattern.creational.factory.factoryMethod.factory;


import com.test.designPattern.creational.factory.factoryMethod.component.Shape;

public class FactorySelection {
    public static Shape getShapeInstance(ShapeType shapeType) throws IllegalAccessException {
        Shape shape=null;
        if(shapeType == null){
            return null;
        }
        switch(shapeType){
            case CIRCLE:
                ShapeFactory circleFactory = new CircleFactory();
                shape = circleFactory.createShape();
                break;
            case SQUARE:
                ShapeFactory squareFactory = new SquareFactory();
                shape= squareFactory.createShape();
                break;
            default: throw new IllegalAccessException("Shape doesnt exist.");
        }
        return shape;
    }
}
