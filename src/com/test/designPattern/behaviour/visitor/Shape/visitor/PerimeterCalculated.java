package com.test.designPattern.behaviour.visitor.Shape.visitor;

import com.test.designPattern.behaviour.visitor.Shape.element.Circle;
import com.test.designPattern.behaviour.visitor.Shape.element.Rectangle;
import com.test.designPattern.behaviour.visitor.Shape.element.Square;

public class PerimeterCalculated implements IShapeVisitor{
    int perimeter;

    @Override
    public void visitCircle(Circle circle) {
        perimeter = (int) (2 * Math.PI * circle.getRadius());
        System.out.println("The perimeter of circle is : "+perimeter);
    }

    @Override
    public void visitSquare(Square square) {
        perimeter = 4 * square.getLength();
        System.out.println("The perimeter of square is : "+perimeter);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        perimeter = 2* (rectangle.getLength() * rectangle.getBreadth());
        System.out.println("The perimeter of rectangle is : "+perimeter);

    }
}
