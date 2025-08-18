package com.test.core.exception;
import java.util.Scanner;

/**
 *  Example application 2 demonstrating custom exception
 *
 *  User between the age <18<65 can apply for license , others aged user cannot.
 *  Give 2 chances to user who is under aged.
 */

class UnderAgeException extends Exception{
    public UnderAgeException(String message) {
        super(message);
    }
}

class OverAgeException extends Exception{
    public OverAgeException(String message) {
        super(message);
    }
}

class Applicant{
    int age;

    public void input() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly Enter your age");
        age=scan.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException{
        if(age<18){
            throw new UnderAgeException("Sorry, You need to be 18 to apply for a license");
        }
        else if(age>60){
            throw new OverAgeException("Sorry, You shouldnt drive anymore but you should enjoy your life leisurely ");

        }
        else {
            System.out.println("You are eligible to apply for license, please go ahead with the process");
        }
    }
}

class RTO{
    public void applyLicence(){
        Applicant applicant=new Applicant();

        try {
            applicant.input();
            applicant.verify();
        }
        catch (UnderAgeException e) {
            System.out.println(e.getMessage());

            //one more chance for under aged person
            try {
                applicant.input();
                applicant.verify();
            }
            catch (UnderAgeException ex) {
                System.out.println(ex.getMessage());
            }
            catch (OverAgeException ex1) {
                System.out.println(ex1.getMessage());
            }
        }
        catch (OverAgeException e1) {
            System.out.println(e1.getMessage());
        }
    }
}

public class Exceptions12 {
    public static void main(String[] args) {
        RTO rto=new RTO();
        rto.applyLicence();

    }
}
