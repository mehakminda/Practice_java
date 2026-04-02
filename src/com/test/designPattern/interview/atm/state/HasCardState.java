package com.test.designPattern.interview.atm.state;

import com.test.designPattern.interview.atm.ATM;
import com.test.designPattern.interview.atm.Card;

public class HasCardState extends ATMState {

    public HasCardState(){
        System.out.println("enter your card pin number");
    }


    public void authenticatePin(ATM atm, Card card, int pin){
        if(card.isCorrectPinEntered(pin)){
            System.out.println("Pin is correct");
            atm.setCurrentState(new SelectOptionState());
        }
        else{
            System.out.println("Incorrect pin entered");
            exit(atm);
        }

    }
}
