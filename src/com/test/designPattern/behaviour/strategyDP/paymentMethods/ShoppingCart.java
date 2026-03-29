package com.test.designPattern.behaviour.strategyDP.paymentMethods;

import com.test.designPattern.behaviour.strategyDP.paymentMethods.strategies.PaymentStrategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    ShoppingCart(PaymentStrategy paymentStrategy){//constructor injection or setter injection
        this.paymentStrategy=paymentStrategy;
    }

    public void checkout(double amount){
        System.out.println(this.paymentStrategy.getClass().getSimpleName());
        paymentStrategy.pay(amount);
    }
}
