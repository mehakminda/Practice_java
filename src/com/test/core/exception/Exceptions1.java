package com.test.core.exception;

import java.util.Scanner;

/**
 * What is compile time error and run time error (Application is abruptly termination)
 *
 * Enclose the possible error/risky code in try-catch block. Catch block is associated with handling exception.
 * Which method frame will create the exception object?.. Method in which error statement is present, here its main
 */
public class Exceptions1 {
    public static void main(String[] args) {
        System.out.println("Welcome to My App to divide");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator");
        int num=sc.nextInt();
        System.out.println("Enter denominator");
        int deno=sc.nextInt();
        //System.out.println(num/deno); //RunTime error occurs :: Application is abruptly termination

        try{
            System.out.println(num/deno);
        }
        catch (ArithmeticException e){
            System.out.println("Exception occured");
            System.out.println("toString: "+e.toString());
            System.out.println("getMessage: "+e.getMessage());
            e.printStackTrace();


        }
        System.out.println("Thank you for using my app");


        try{
            System.out.println(num/deno);
        }
        catch (ArrayIndexOutOfBoundsException e){ //incorrect exception handler therefore abnormal terimination
            System.out.println("Exception occured");
            e.printStackTrace();
        }
        System.out.println("Thank you for using my app");
    }
}
