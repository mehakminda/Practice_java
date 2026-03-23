package com.test.designPattern.structural.decorator.pizzaApp;

public class PizzaShop {
    public static void main(String[] args) {
        //Create a plain pizza
        BasePizza basePizza1=new PlainPizza();
        System.out.println("Order1: "+basePizza1.getDescription()+"=Rs. "+basePizza1.getCost());

        //Add toppings to the plain pizza - extra cheese only
        BasePizza basePizza2=new CheeseTopping(new PlainPizza());
        System.out.println("Order2: "+basePizza2.getDescription()+"=Rs. "+basePizza2.getCost());

        //Farm House Pizza
        BasePizza basePizza3=new FarmHouse();
        System.out.println("Order3: "+basePizza3.getDescription()+"=Rs. "+basePizza3.getCost());

        BasePizza basePizza4= new MushroomTopping(new CheeseTopping(new FarmHouse()));
        System.out.println("Order4: "+basePizza4.getDescription()+"=Rs. "+basePizza4.getCost());
    }
}
//in decorator pattern decorator abstract class is is-a and has-a relationship