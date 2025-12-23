package com.test.oops.inheritance;

/**
 * Types of method in inherited class
 *
 * Different types of objects that can be created inheritenace
 *
 */
class A3{
    public void m1(){
        System.out.println("m1 method from Class A3");
    }
    public void m2(){
        System.out.println("m2 method from Class A3");
    }
}
class B3 extends A3{
    public void m1(){
        System.out.println("m1 method from Class B3");
    }
    public void m3(){
        System.out.println("m3 method from Class B3");
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        B3 b31= new B3();
        b31.m1(); //overriden method
        b31.m2(); //inherited method
        b31.m3(); //specialized/new mthod/ only child has this method
        System.out.println("-------------------");

        //B3 b32=new  A3();  //error -not allowed
        System.out.println("-------------------");

        A3 a31= new A3();
        a31.m1();
        a31.m2();
        //a31.m3(); //doesnt exists
       // ((B3) a31).m3(); // even if we cast it we get error : java.lang.ClassCastException: A3 cannot be cast to class B3
        System.out.println("-------------------");

        A3 a32= new B3();
        a32.m1();
        a32.m2();
        ((B3) a32).m3(); //casting qualifier - typecasting
        System.out.println("-------------------");

    }
}
