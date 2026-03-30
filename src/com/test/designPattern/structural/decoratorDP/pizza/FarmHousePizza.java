package com.test.designPattern.structural.decoratorDP.pizza;

public class FarmHousePizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public float getCost() {
        return 300;
    }
}
