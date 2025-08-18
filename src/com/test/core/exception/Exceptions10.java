package com.test.core.exception;
import java.util.Scanner;

/**
 * Custom Exception:
 *
 */
class InvalidUserException extends Exception{

}

class Atm {
    private int acc_num=1111;
    private int password=2222;

    int acNo;
    int pw;

    public void input() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly! Enter your accNum");
        acNo=scan.nextInt();
        System.out.println("Kindly! Enter your PIN");
        pw=scan.nextInt();
    }

    public void verify() throws InvalidUserException {
        if(acc_num==acNo && password==pw) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Kindly! Enter your amount required ");
            int amount=scan.nextInt();
            System.out.println("Collect your cash : "+ amount);
        }
        else {
            System.out.println("Are you sure this is your own card? Want too try again?");
            //throw new InvalidUserException();
            InvalidUserException iue=new InvalidUserException();
            System.out.println("Wrong credentials! Are you sure you are using your own credentials");
            throw iue;
        }
    }
}
class Bank {
    public void initiate() {
        System.out.println("Welcome to Telusko Bank");
        Atm atm=new Atm();

        try {
            atm.input();
            atm.verify();
        }
        catch (InvalidUserException e) {
            try {
                atm.input();
                atm.verify();
            } catch (InvalidUserException e1) {
                try {
                    atm.input();
                    atm.verify();
                } catch (InvalidUserException e3) {
                    System.out.println(" *** 3 chances are given, card is now blocked. ***");
                }
            }
        }

    }
}


public class Exceptions10 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.initiate();
    }
}
