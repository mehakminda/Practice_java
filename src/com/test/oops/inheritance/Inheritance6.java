package com.test.oops.inheritance;


/**
 * variables in inheritances
 */
class A6{
    int a=10;
    void disp(){
        System.out.println("disp method of parent");
        System.out.println(a);
    }
}
class B6 extends A6{
    int a=20;
    void disp(){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        super.disp();
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        B6 b6=new B6();
        b6.disp(); //child

        System.out.println("-------------------");
        A6 a6=new B6();
        a6.disp();
    }
}
