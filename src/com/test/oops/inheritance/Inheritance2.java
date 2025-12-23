package com.test.oops.inheritance;

/**
 * Constructor is not inherited
 *
 * Parent class constructor gets executed because the first line of a D class constructor is super();
 *
 */

class A2{
    A2(){
        System.out.println("A2 class Constructor");
    }
    A2( int x){
        System.out.println("A2 class Parametrized Constructor");
    }
}
class B2 extends A2{
    B2(){
        System.out.println("B2 class Constructor");
    }
    B2( int x){
        System.out.println("B2 class Parametrized Constructor");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        B2 b21=new B2();
        System.out.println("-------------------");
        B2 b22=new B2(10);
        //d1.A2(); //error
        //d1.A2(10); //error
    }
}
