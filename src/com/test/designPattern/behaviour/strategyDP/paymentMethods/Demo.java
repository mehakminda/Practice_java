package com.test.designPattern.behaviour.strategyDP.paymentMethods;

import com.test.designPattern.behaviour.strategyDP.paymentMethods.strategies.CreditCardPayment;
import com.test.designPattern.behaviour.strategyDP.paymentMethods.strategies.PayPalPayment;

public class Demo {
    static void main() {
        //checkout shopping cart1
        ShoppingCart shoppingCart1=new ShoppingCart(new CreditCardPayment("123-973-256"));
        shoppingCart1.checkout(200);


        //checkout shopping cart2
        ShoppingCart shoppingCart2=new ShoppingCart(new PayPalPayment("mindamehak@gmail.com"));
        shoppingCart2.checkout(200);

    }
}
