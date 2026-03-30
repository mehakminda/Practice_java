package com.test.designPattern.structural.decoratorDP.topping;

import com.test.designPattern.structural.decoratorDP.pizza.BasePizza;

public class VeggieTopping extends ToppingDecorator{

    public VeggieTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Veggies";
    }

    @Override
    public float getCost() {
        return pizza.getCost() + 40;
    }
}
