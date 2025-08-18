package com.test.core.exception;

import java.util.Scanner;

/**
 * Ducking the exception: Passing the exception to parent class.
 * Not handling the exception in method body
 * Write throws and kind of exception in method signature, so that caller/parent method would know
 * which exception to handle it with
 */

class Beta{
    public  void beta() throws ArithmeticException{
        Scanner scan=new Scanner(System.in);
        System.out.println("Kindly enter the numerator to divide");
        int num1=scan.nextInt();
        System.out.println("Kindly enter the denominator");
        int num2=scan.nextInt();
        int res=num1/num2;
        System.out.println("The res is : "+ res);
        System.out.println("child method executed");
    }
}
public class Exceptions4 {

    public static void main(String[] args) {
        Beta b =new Beta();
        //b.beta();
        // we will get abnormal termination if the exception is not handled in both child stack frame/parent stack frame
        try{
            b.beta(); // the create of beta function is instructing to handle the exception
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught in main method");
        }
        System.out.println("Application executed");
    }
}
