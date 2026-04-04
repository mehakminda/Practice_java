package com.test.designPattern.behaviour.visitor.Shape.element;

import com.test.designPattern.behaviour.mediator.IColleague;
import com.test.designPattern.behaviour.visitor.Shape.visitor.IShapeVisitor;

public class Rectangle implements IShape
{
     int length;
     int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    @Override
    public void accept(IShapeVisitor shapeVisitor) {
        shapeVisitor.visitRectangle(this);

    }
}
