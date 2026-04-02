package com.test.designPattern.interview.atm.state;

import com.test.designPattern.interview.atm.ATM;
import com.test.designPattern.interview.atm.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentState(new HasCardState());
    }

}
