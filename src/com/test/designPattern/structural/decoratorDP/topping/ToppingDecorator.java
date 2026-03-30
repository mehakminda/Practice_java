package com.test.designPattern.structural.decoratorDP.topping;

import com.test.designPattern.structural.decoratorDP.pizza.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza pizza;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
