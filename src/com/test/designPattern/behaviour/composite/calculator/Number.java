package com.test.designPattern.behaviour.composite.calculator;

public class Number implements ArthematicExpression{
    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int evaluate() {
        return num;
    }
}
