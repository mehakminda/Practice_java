package com.test.oops.inheritance;

/**
 * Static method gets inherited
 *
 * Can we override static method?
 * Static method cannot be overridden, whenever we try to override the static method, a specialzied method is created and does
 * not allow us to override parent class method instead hides the parent class method ..importance of @override..
 *
 */
class A10{
    public static void m1(){
        System.out.println("Static method m1 from class A10");
    }
    public static void m2()
    {
        System.out.println("Static method m2 from class A10");
    }
}

class B10 extends A10{
    public static void m2()
    {
        System.out.println("Static method m2 from class B10");
    }
}
public class Inheritance10 {
    public static void main(String[] args) {
        B10 b10= new B10();
        b10.m1();
        b10.m2();
    }
}
