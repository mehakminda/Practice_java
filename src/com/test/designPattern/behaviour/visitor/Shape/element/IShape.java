package com.test.designPattern.behaviour.visitor.Shape.element;


import com.test.designPattern.behaviour.visitor.Shape.visitor.IShapeVisitor;

public interface IShape {
    void accept(IShapeVisitor shapeVisitor);
}
