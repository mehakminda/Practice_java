package com.test.designPattern.behaviour.visitor.Shape.element;

import com.test.designPattern.behaviour.visitor.Shape.visitor.IShapeVisitor;

public class Square implements IShape{
     int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void accept(IShapeVisitor shapeVisitor) {
        shapeVisitor.visitSquare(this);

    }
}
