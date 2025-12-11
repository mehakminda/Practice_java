package com.test.oops.staticKeyword;

/**
 * Static variable/method are first thing that gets executed as soon as class is loaded.
 *
 * First Static2 class got loaded coz that is the file name and has main method.
 * static block of Static2 class is executed.
 * When we create an object of ABC, only then the ABC class is loaded in class loading subsystem.
 * But since we never created object of DEF, the static block on DEF was never executed.
 */
public class Static2 {
    static int a=20;
    static {
        a=10;
        System.out.println(a);
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        ABC abc=new ABC();
    }
}

class ABC{
    static{
        System.out.println("Hello from ABC");
    }
}

class DEF{
    static{
        System.out.println("Hello from DEF");
    }
}
