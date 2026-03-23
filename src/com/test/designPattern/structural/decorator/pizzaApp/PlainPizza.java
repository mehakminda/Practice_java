package com.test.designPattern.structural.decorator.pizzaApp;

public class PlainPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}
