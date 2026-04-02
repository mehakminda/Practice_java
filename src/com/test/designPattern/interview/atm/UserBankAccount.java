package com.test.designPattern.interview.atm;

public class UserBankAccount {
    int balance;
    public void withdrawAmount(int amount){
        balance = balance - amount;
    }
}
