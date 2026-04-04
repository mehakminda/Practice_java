package com.test.designPattern.behaviour.visitor.Shape.visitor;

import com.test.designPattern.behaviour.visitor.Shape.element.Circle;
import com.test.designPattern.behaviour.visitor.Shape.element.Rectangle;
import com.test.designPattern.behaviour.visitor.Shape.element.Square;

 public interface IShapeVisitor {
    void visitCircle(Circle circle);
    void visitSquare(Square square);
    void visitRectangle(Rectangle reactangle);
}
