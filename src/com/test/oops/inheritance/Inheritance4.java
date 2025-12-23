package com.test.oops.inheritance;

/**
 * child class expects non-parameterized constructor in parent
 */
class A4{
    A4(int x){
        System.out.println("Parameterized Constructor of A4");
    } //parameterized constructor overrides the deafult constructor
}
class B4 extends A4{
    B4(){
        super(10); // comment this and check error
        System.out.println("Default Constructor of B4");
    }
    B4(int a){
        super(10); //comment this and check error
        System.out.println("Parameterized Constructor of B4");
    }
}
public class Inheritance4 {
    public static void main(String[] args) {
        B4 b1=new B4();
        B4 b2=new B4(10);

    }
}
