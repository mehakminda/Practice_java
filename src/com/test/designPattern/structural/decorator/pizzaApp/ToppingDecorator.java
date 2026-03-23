package com.test.designPattern.structural.decorator.pizzaApp;

import java.util.Objects;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = Objects.requireNonNull(basePizza, "basePizza cannot be null");
    }
}
