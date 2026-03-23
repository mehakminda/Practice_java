package com.test.designPattern.structural.decorator.pizzaApp;

public class FarmHouse implements BasePizza{
    @Override
    public String getDescription() {
        return "FarmHouse pizza";
    }

    @Override
    public double getCost() {
        return 300.00;
    }
}
