package com.test.designPattern.interview.atm.state;

import com.test.designPattern.interview.atm.ATM;
import com.test.designPattern.interview.atm.Card;

public class CheckBalanceState extends ATMState {

    public CheckBalanceState() {
    }


    public void displayBalance(ATM atm, Card card){
        System.out.println("Your balance is "+ card.getBalance());
        exit(atm);
    }
}
