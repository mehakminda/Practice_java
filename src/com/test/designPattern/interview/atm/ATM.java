package com.test.designPattern.interview.atm;

import com.test.designPattern.interview.atm.state.ATMState;
import com.test.designPattern.interview.atm.state.IdleState;

public class ATM {
    private static ATM ATMObject = new ATM(); //Singleton: eager initialization

    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM(){

    }
    public void setCurrentState(ATMState  currentATMState){
        this.currentATMState=currentATMState;

    }
    public ATMState getCurrentATMState(){
        return this.currentATMState;
    }
    public static ATM getATMObject(){
        ATMObject.setCurrentState(new IdleState()); //set initial state
        return ATMObject;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }


    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }


    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }


    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount){
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }
    public void printATMStatus(){
        System.out.println("Balance: "+ atmBalance);
        System.out.println("2kNotes: "+noOfTwoThousandNotes);
        System.out.println("500Notes: "+noOfFiveHundredNotes);
        System.out.println("100Notes: "+noOfOneHundredNotes);
    }


}
