package com.test.oops.staticKeyword;

/**
 * Static and Non-static member variable
 *
 * Non-static member variable cannot be used inside static method/block
 * As they are created when object is created.
 *
 * Static member variable is created once and it resides in heap memory and is common for all onject of that class
 *
 *
 */
public class Static6 {
    static int a=10;
    int x=20;
    static{
        System.out.println("Static block");
        System.out.println(a);
       // System.out.println(x); error
    }
    {
        System.out.println("Non-static block");
        System.out.println(a);
        System.out.println(x);
    }
    { //Can we have multiple java initialization block .. Yes
        System.out.println("Non-static block2");
        System.out.println(a);
        System.out.println(x);
    }
    public static void  disp(){
            System.out.println("Static method");
            System.out.println(a);
            //System.out.println(x); //error non-static variable inside static method
    }
    public  void  show(){
            System.out.println("Non-Static method");
            System.out.println(a);
            System.out.println(x);

    }
    Static6(){
        System.out.println("Constructor method");
        System.out.println(a);
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Static6 s6=new Static6();
        s6.show();
        disp();
        System.out.println("Main method");
        System.out.println(s6.a);
        System.out.println(s6.x);

    }
}
