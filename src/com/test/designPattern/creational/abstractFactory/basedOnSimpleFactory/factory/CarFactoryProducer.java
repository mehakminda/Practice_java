package com.test.designPattern.creational.abstractFactory.basedOnSimpleFactory.factory;

public class CarFactoryProducer {
    public static Object getFactory(String choice){
        if(choice.equals("interior")){
            return new InteriorFactory();

        }
        else if(choice.equals("exterior")){
            return new ExteriorFactory();
        }
        else {
            return null;
        }
    }
}
