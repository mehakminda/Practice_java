package com.test.designPattern.structural.decoratorDP.pizza;

public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public float getCost() {
        return 200;
    }
}
