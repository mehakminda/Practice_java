package com.test.designPattern.behaviour.visitor.Shape;

import com.test.designPattern.behaviour.visitor.Shape.element.Circle;
import com.test.designPattern.behaviour.visitor.Shape.element.Rectangle;
import com.test.designPattern.behaviour.visitor.Shape.element.Square;
import com.test.designPattern.behaviour.visitor.Shape.visitor.AreaCalculator;
import com.test.designPattern.behaviour.visitor.Shape.visitor.PerimeterCalculated;

public class ShapeApp {
    static void main() {
        Circle circle = new Circle(10);
        Rectangle rectangle =new Rectangle(10,20);
        Square square = new Square(10);

        AreaCalculator area=new AreaCalculator();
        PerimeterCalculated perimeter = new PerimeterCalculated();

        circle.accept(area);
        circle.accept(perimeter);

        rectangle.accept(area);
        rectangle.accept(perimeter);

        square.accept(area);
        square.accept(perimeter);
    }
}
