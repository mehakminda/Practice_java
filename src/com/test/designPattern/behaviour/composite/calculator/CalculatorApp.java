package com.test.designPattern.behaviour.composite.calculator;

public class CalculatorApp {
    static void main() {
        System.out.println("======= Composite Design Pattern ======");

        Number one= new Number(1);
        Number two= new Number(2);
        Number seven= new Number(7);

        Expression exp1 = new Expression(OperationType.MULTIPLY,two,seven);
        Expression exp2 = new Expression(OperationType.ADD,one,exp1);

        System.out.println(exp2.evaluate());

    }
}
