package com.test.oops.abstraction;

/**
 * class, method, variable  can be final.
 * final class cannot be inherited
 * final method cannot be overridden(hence cannot participate in inheritance)
 * final variable can be inherited but it cannot change its value (i.e) behaves like a constant
 *
 *
 * Can we make abstract class final? No
 * Can we make abstract method final? NO
 */
public class final1 {
    public static void main(String[] args) {


        MyfinalClass1 c1=new MyfinalClass1();
        c1.m1();

        B3 b3=new B3();
        b3.m1();
    }
}

final class MyfinalClass1{
    final int  x=10;
    final void m1(){
        System.out.println("Hello from final class");
    }
}

class A3{
    final int a=10; //initialization is must
    final void m1(){
        System.out.println("Hello from final method m1");
    }
}
class B3 extends A3{
    // void m1(){}  //notice the error,

    //a=20;
}


