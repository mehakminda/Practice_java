package com.test.designPattern.behaviour.template;

public class TemplateDemo {
    static void main() {
        PaymentFlow payToFriend =new BankTransfer();
        payToFriend.sendMoney();

        System.out.println("----------------");
        PaymentFlow payToMerchant = new BankTransfer();
        payToMerchant.sendMoney();
    }
}
