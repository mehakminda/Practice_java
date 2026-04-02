package com.test.designPattern.interview.atm.state;

import com.test.designPattern.interview.atm.ATM;
import com.test.designPattern.interview.atm.AmountWithdrawal.CashWithdrawProcessor;
import com.test.designPattern.interview.atm.AmountWithdrawal.FiveHundredWithdrawProcessor;
import com.test.designPattern.interview.atm.AmountWithdrawal.OneHundredWithdrawProcessor;
import com.test.designPattern.interview.atm.AmountWithdrawal.TwoThousandWithdrawProcessor;
import com.test.designPattern.interview.atm.Card;

public class CashWithdrawalState extends ATMState {

    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }



    public void cashWithdrawal(ATM atm, Card card, int amount){

        int atmAmount= atm.getAtmBalance();
        if(amount > atmAmount) {
            System.out.println("Insufficient fund in ATM ");
            exit(atm);
        }
        else if(amount > card.getBalance()){
            System.out.println("Insufficient balance in the your Bank Account");
            exit(atm);
        }
        else{
            card.deductBankBalance(amount);
            atm.deductATMBalance(amount);
            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            withdrawProcessor.withdraw(atm, amount);
        }


    }
}
