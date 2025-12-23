package com.test.oops.inheritance;

/**
 * Changing the parameter list of the method in child class, so this is not method overriding its method overloading.
 */
class A9{
    void disp(int x){
        System.out.println("disp of parent "+x);
    }
}
class B9 extends A9{
    void disp(int x, int y){
        System.out.println("disp of child "+x+", "+y);
    }
}
public class Inheritance9 {
    public static void main(String[] args) {
        B9 b9= new B9();
        b9.disp(10);
        b9.disp(10,20);
    }
}
