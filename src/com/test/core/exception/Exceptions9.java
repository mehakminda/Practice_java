package com.test.core.exception;

/**
 * Nesting of try catch
 *
 * If inner catch is unable to handle exception , outer catch will handle it
 */
public class Exceptions9 {
    public static void main(String[] args) {

        try{
            System.out.println("Outer try block");
            try{
                System.out.println("Inside inner try");
                System.out.println(10/0);
            }
            catch (ArithmeticException e){
                System.out.println("Exception handled in inner catch");

            }
            System.out.println("Outside inner try");
        }
        catch(ArithmeticException e){
            System.out.println("Inside outer catch block");
        }
        finally {
            System.out.println("Finally block");
        }


        //Not handling exception in inner catch, but its handled in outer catch
        System.out.println("---------------------------------------------");
        try{
            System.out.println("Outer try block");
            try{
                System.out.println("Inside inner try");
                System.out.println(10/0);
            }
            catch (NullPointerException e){
                System.out.println("Exception handled in inner catch");

            }
            System.out.println("Outside inner try");
        }
        catch(ArithmeticException e){
            System.out.println("Inside outer catch block");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
