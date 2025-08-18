package com.test.core.exception;
import java.util.Scanner;
/**
 * If catch is unable to handle the right exception, finally block will be executed but will not handle exception,
 * hence abnormal termination of application
 */

class Gamma3{
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
        catch(NullPointerException e){
            System.out.println("Catching Exception caught in Gamma");
            throw e;
        }
        finally{
            System.out.println("child method executed");
        }

    }
}
public class Exceptions8{
    public static void main(String[] args) {
        Gamma3 g =new Gamma3();
            g.gamma();



    }
}
