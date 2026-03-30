package com.test.designPattern.creational.factory.simpleFactory;

import com.test.designPattern.creational.factory.simpleFactory.component.Shape;
import com.test.designPattern.creational.factory.simpleFactory.factory.ShapeFactory;
import com.test.designPattern.creational.factory.simpleFactory.factory.ShapeType;

public class SimpleFactoryDemo {
    static void main() {
        System.out.println("========= Simple Factory Design pattern ==========");

        //set the type you want
        ShapeType shapeType= ShapeType.SQUARE;

        //get the shape
        Shape shape = null;
        try {
            shape = ShapeFactory.createShapeInstance(shapeType);
            shape.draw();
            shape.computeArea();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println("App closed");
    }
}
