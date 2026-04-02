package com.test.designPattern.interview.atm.state;

import com.test.designPattern.interview.atm.ATM;
import com.test.designPattern.interview.atm.Card;
import com.test.designPattern.interview.atm.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }
    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }
    public void selectOperation(ATM atm, Card card, TransactionType txType){
        System.out.println("OOPS!! Something went wrong");
    }
    public void cashWithdrawal(ATM atm, Card card, int amount){
        System.out.println("OOPS!! Something went wrong");
    }
    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }
    public void returnCard(){
        System.out.println("Please collect your card");
    }
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentState(new IdleState());
        System.out.println("Exit happens");

    }
}
