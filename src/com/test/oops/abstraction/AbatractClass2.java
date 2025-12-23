package com.test.oops.abstraction;

/**
 * Can Abstract classes have constructor? Yes, also it should be implemented in abstract class only
 * Can contructor be abstract ? No coz it cannot be inherited
 * Can interface have constructor? NO, coz its 100% abstraction
 */
abstract class A2{
   // abstract int a; abatract class variables are not allowed
    abstract public void m1();
    abstract public void m2();
    public A2(){
        System.out.println("A2 Constructor");
    }
   // abstract public A2(int a);
}

class B2 extends A2{
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
public class AbatractClass2 {
    public static void main(String[] args) {
        B2 b2=new B2();
        b2.m1();
        b2.m2();
        b2.m3();
    }

}
