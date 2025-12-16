package com.test.oops.staticKeyword;


/**
 * Priority of execution
 * 1. Static variable
 * 2. Static block
 * 3. Static method
 * 4. Instance variable(non-static variable)
 * 5. Java initialization block(non-static block) Then constructor( ie at obj creation)
 * 6. non-static method
 */
public class Static3 {
    static int a,b;
    int x,y;
    static{
        a=10;
        b=20;
        System.out.println("Static Initialization block");
    }
    {
        x=100;
        y=200;
        System.out.println("Java non-static initialization block");
    }

    Static3(){
        System.out.println("Constructor");
    }

    static void disp1(){
        System.out.println("Static disp1 method");
        System.out.println(a);
        System.out.println(b);
    }

    void disp2(){
        System.out.println("Non-Static disp2 method");
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        Static3 st2=new Static3();
        st2.disp2();
        disp1();
    }
}

