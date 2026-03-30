package com.test.designPattern.structural.decoratorDP.topping;

import com.test.designPattern.structural.decoratorDP.pizza.BasePizza;

public class CheeseTopping extends ToppingDecorator{


    public CheeseTopping(BasePizza pizza) {
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
