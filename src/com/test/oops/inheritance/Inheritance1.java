package com.test.oops.inheritance;


/**
 * Every class extends the Object class
 *
 * Private members do not participate in inheritance
 */

class A{ //Parent class/Base class/Super class
    int age;
    private int year;
    void disp(){
        System.out.println("Human class method");
    }
    private void show(){ //private method
        System.out.println("Human class method");
    }
}
class B extends A{// Child class/sub class/derived class
    void showAge(){
        age=18;
        //year=2020; //private variables will not be inherited to preserve encapsulation
        System.out.println(age);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        B b=new B();
        b.showAge();
        b.disp();
       // b.show(); //private methods will not be inherited to preserve encapsulation

    }
}
