package com.test.designPattern.interview.atm;

import com.test.designPattern.interview.atm.state.IdleState;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(){
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        atmRoom.atm.printATMStatus();
        System.out.println("current atm state is: "+atmRoom.atm.getCurrentATMState().getClass().getSimpleName());
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm,atmRoom.user.card,112211);
       //System.out.println("current atm state is: "+atmRoom.atm.getCurrentATMState().getClass().getSimpleName());
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm,atmRoom.user.card,TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm,atmRoom.user.card,3500);
        System.out.println("current atm state is: "+atmRoom.atm.getCurrentATMState().getClass().getSimpleName()); //idle state
        atmRoom.atm.getCurrentATMState().exit(atmRoom.atm); //exiting idle state
        atmRoom.atm.printATMStatus();

    }
    public void initialize(){
        //create ATM card
        atm = ATM.getATMObject();
        atm.setAtmBalance(3500,1,2,5);

        //create user
        this.user = createUser();

    }
    public User createUser(){
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    public Card createCard(){
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }
    public UserBankAccount createBankAccount(){
        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance=5000;
        return bankAccount;
    }


}
