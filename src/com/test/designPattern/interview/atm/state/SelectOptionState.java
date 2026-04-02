package com.test.designPattern.interview.atm.state;

import com.test.designPattern.interview.atm.ATM;
import com.test.designPattern.interview.atm.Card;
import com.test.designPattern.interview.atm.TransactionType;

public class SelectOptionState extends ATMState {

    public SelectOptionState(){
        showOptions();
    }
    public void showOptions(){
        TransactionType.showAllTransactionType();
    }
    public void selectOperation(ATM atmObject, Card card, TransactionType type){
        switch(type){
            case CASH_WITHDRAWAL :
                atmObject.setCurrentState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atmObject.setCurrentState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
                exit(atmObject);
        }
    }
}
