package com.test.core.exception;

import java.util.Scanner;

/**
 * 'Exception handler' object is propagated to parent method if exception handler is not found in child method
 */

class Alpha{
    public  void alpha(){
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
public class Exceptions3 {

    public static void main(String[] args) {
        Alpha a =new Alpha();
        //a.alpha();
        // we will get abnormal termination if the exception is not handled in both child stack frame/parent stack frame
        try{
            a.alpha();
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught in main method");
        }
        System.out.println("Application executed");
    }
}
