package com.test.designPattern.interview.atm;

public enum TransactionType {
    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void showAllTransactionType(){
        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }

    }
}
