package com.test.designPattern.behaviourDP.paymentMethods;

import com.test.designPattern.behaviourDP.paymentMethods.strategies.CreditCardPayment;
import com.test.designPattern.behaviourDP.paymentMethods.strategies.PayPalPayment;
import com.test.designPattern.behaviourDP.paymentMethods.strategies.PaymentStrategy;

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
