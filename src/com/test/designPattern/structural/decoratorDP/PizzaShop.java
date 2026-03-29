package com.test.designPattern.structural.decoratorDP;

import com.test.designPattern.structural.decoratorDP.pizza.BasePizza;
import com.test.designPattern.structural.decoratorDP.pizza.FarmHousePizza;
import com.test.designPattern.structural.decoratorDP.pizza.PlainPizza;
import com.test.designPattern.structural.decoratorDP.topping.CheeseTopping;
import com.test.designPattern.structural.decoratorDP.topping.MushroomTopping;

public class PizzaShop {

    static void main() {

        System.out.println("======= Decorator Design Pattern ======");


        //Plain pizza
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1: " + pizza1.getDescription() + " = Rs." + pizza1.getCost());

        BasePizza pizza2 = new MushroomTopping(new PlainPizza());
        System.out.println("Order 2: "+ pizza2.getDescription() + " = Rs."+pizza2.getCost());

        //Farm House
        BasePizza pizza3 = new FarmHousePizza();
        System.out.println("Order 3: " + pizza3.getDescription() + " = Rs." + pizza3.getCost());

        BasePizza pizza4= new MushroomTopping(new CheeseTopping(new FarmHousePizza()));
        System.out.println("Order 4: "+ pizza4.getDescription() + " = Rs."+pizza4.getCost());
    }
}
