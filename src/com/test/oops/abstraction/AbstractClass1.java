package com.test.oops.abstraction;

/**
 * Abstract classes have abstarct methods
 *
 * We can create reference of abstarct class but not the object of abstract class
 *
 */
abstract class A1{
    abstract public void m1();
    abstract public void m2();
}

class B1 extends A1{
    public void m3(){
        System.out.println("hello for m3 from Class B1");
    }

    public void m1() {
        System.out.println("m1 from class B1");
    }

    public void m2() {
        System.out.println("m2 from class B2");
    }
}
public class AbstractClass1 {
    public static void main(String[] args) {
        B1 b1=new  B1();
        b1.m1();
        b1.m2();
        b1.m3();



        //A1 a1=new A1(); //not allowed
        A1 a12=new B1();
        a12.m1();
        a12.m2();
        //a12.m3();//check error and add quatifier to get below
        ((B1) a12).m3();
    }
}

