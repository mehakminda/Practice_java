package com.test.core.exception;
import java.util.Scanner;
/**
 * Finally
 * Finally block will be executed even though there is a throw
 * Finally block will be executed irrespective of whether the exception have occurred or not
 * If catch is unable to handle the right exception, finally block will be executed but will not handle exception,
 * hence abnormal termination of application
 * Finally will be executed even if catch block is able to handle the exception
 * Finally block dominate the throw keyword
 *
 * Usage: Used for cleanup/closing resources
 * try-catch-finally, try-finally
 */

class Gamma2{
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
            System.out.println("Exception caught in Gamma");
            throw e;
        }
        finally{
            System.out.println("child method executed"); //finally block override the throw method
            //but because throw is present, the exception will also be handled in main as well
        }

    }
}
public class Exceptions7 {
    public static void main(String[] args) {
        Gamma2 g =new Gamma2();
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
