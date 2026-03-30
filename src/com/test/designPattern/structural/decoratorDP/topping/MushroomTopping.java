package com.test.designPattern.structural.decoratorDP.topping;

import com.test.designPattern.structural.decoratorDP.pizza.BasePizza;

public class MushroomTopping extends ToppingDecorator{

    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ " + Mushroom";
    }

    @Override
    public float getCost() {
        return pizza.getCost()+20;
    }
}
