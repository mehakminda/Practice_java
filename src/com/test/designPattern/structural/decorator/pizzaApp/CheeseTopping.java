package com.test.designPattern.structural.decorator.pizzaApp;

public class CheeseTopping extends ToppingDecorator{
    public CheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+" Extra cheese";
    }

    @Override
    public double getCost() {
        return basePizza.getCost()+20;
    }
}
