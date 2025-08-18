package com.test.core.exception;
import java.util.Scanner;
/**
 * Re-throw the exception -> using throw keyword
 *
 */
class Gamma{
    public  void gamma() throws ArithmeticException{
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println("Kindly enter the numerator to divide");
            int num1=scan.nextInt();
            System.out.println("Kindly enter the denominator");
            int num2=scan.nextInt();
            int res=num1/num2;
            System.out.println("The res is : "+ res);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught in Alpha");
            throw e;
            //System.out.println("Catch of Gamma"); //unreachable statement
        }
        System.out.println("child method executed");
    }
}
public class Exceptions5 {
    public static void main(String[] args) {
        Gamma g =new Gamma();
        //a.alpha();
        // we will get abnormal termination if the exception is not handled in both child stack frame/parent stack frame/both
        try{
            g.gamma();
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught in main method");
        }
        System.out.println("Application executed");

    }
}
