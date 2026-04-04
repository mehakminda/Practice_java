package com.test.designPattern.behaviour.visitor.Shape.element;

import com.test.designPattern.behaviour.visitor.Shape.visitor.IShapeVisitor;

public class Circle implements IShape{
     int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void accept(IShapeVisitor shapeVisitor) {
        shapeVisitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
