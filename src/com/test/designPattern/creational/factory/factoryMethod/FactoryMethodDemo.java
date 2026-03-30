package com.test.designPattern.creational.factory.factoryMethod;

import com.test.designPattern.creational.factory.factoryMethod.component.Shape;
import com.test.designPattern.creational.factory.factoryMethod.factory.FactorySelection;
import com.test.designPattern.creational.factory.factoryMethod.factory.ShapeType;

public class FactoryMethodDemo {
    static void main() {
        System.out.println("========== Factory method design pattern ==========");


        ShapeType shapeType= ShapeType.CIRCLE;

        Shape shape = null;
        try {

            shape = FactorySelection.getShapeInstance(shapeType);
            shape.computeArea();
            shape.draw();

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
