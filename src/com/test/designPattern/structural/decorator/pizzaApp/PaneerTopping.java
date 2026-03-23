package com.test.designPattern.structural.decorator.pizzaApp;

public class PaneerTopping extends ToppingDecorator{
    public PaneerTopping(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public String getDescription() {
        return basePizza.getDescription()+" Paneer";
    }

    @Override
    public double getCost() {
        return basePizza.getCost()+50;
    }
}
