package com.test.oops.staticKeyword;

/**
 * Static variables/block gets loaded and executed during class loading by class loader subsystem.
 * static variables/block exists in heap memory
 * Although the static variables/block exists in heap, they gets executed in stack only
 *
 *
 * Static variable/method are first thing that gets executed.
 *
 */
public class Static1 {
    static int a=20;
    static {
        a=10;
        System.out.println(a);
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");
    }
}



//Printing "Hello" such that it shouldn't be in main -> add in static block
