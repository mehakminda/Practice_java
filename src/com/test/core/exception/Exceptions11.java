package com.test.core.exception;
import java.util.Scanner;

/**
 * Custom Exception:
 *
 */
class InvalidUserException1 extends Exception{

    public InvalidUserException1(String message) {
        super(message);
    }
}

class Atm1 {
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

    public void verify() throws InvalidUserException1 {
        if(acc_num==acNo && password==pw) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Kindly! Enter your amount required ");
            int amount=scan.nextInt();
            System.out.println("Collect your cash : "+ amount);
        }
        else {
            System.out.println("Are you sure this is your own card? Want too try again?");

            throw new InvalidUserException1("Wrong credentials! Are you sure you are using your own credentials");
            // we need to have a parameterized constructor in our InvalidUserException1  class

//            InvalidUserException iue=new InvalidUserException("Wrong credentials! Are you sure you are using your own credentials");
//            throw iue;
        }
    }
}
class Bank1 {
    public void initiate() {
        System.out.println("Welcome to Telusko Bank");
        Atm1 atm=new Atm1();

        try {
            atm.input();
            atm.verify();
        }
        catch (InvalidUserException1 e) {
            System.out.println(e.getMessage());
            try {
                atm.input();
                atm.verify();
            } catch (InvalidUserException1 e1) {
                System.out.println(e1.getMessage());
                try {
                    atm.input();
                    atm.verify();
                } catch (InvalidUserException1 e3) {
                    System.out.println(" *** 3 chances are given, card is now blocked. ***");
                }
            }
        }

    }
}


public class Exceptions11 {
    public static void main(String[] args) {
        Bank1 b=new Bank1();
        b.initiate();
    }
}
