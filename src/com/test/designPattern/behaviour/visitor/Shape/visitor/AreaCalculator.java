package com.test.designPattern.behaviour.visitor.Shape.visitor;

import com.test.designPattern.behaviour.visitor.Shape.element.Circle;
import com.test.designPattern.behaviour.visitor.Shape.element.Rectangle;
import com.test.designPattern.behaviour.visitor.Shape.element.Square;

public class AreaCalculator implements IShapeVisitor{
    int area;

    @Override
    public void visitCircle(Circle circle) {
        area = (int) ( Math.PI * Math.pow(circle.getRadius(),2));
        System.out.println("The area of circle is : "+area);
    }

    @Override
    public void visitSquare(Square square) {
        area = (int) Math.pow(square.getLength(),2);
        System.out.println("The area of square is : "+area);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        area = rectangle.getLength() * rectangle.getBreadth();
        System.out.println("The area of rectangle is : "+area);

    }
}
