package com.test.oops.inheritance;

/**
 * Return Type cannot be changed during method overloading
 * But it can happen, if return type must be a covarient return type (ie) IS-A relationship exists between return type
 */

class A8{
    A8(){
        System.out.println("Parent class A8 default constructor");
    }
    void disp(){
        System.out.println("disp method of parent class A8 ");
    }
}
class B8 extends A8{
    B8(){
        System.out.println("B8 default constructor");
    }
    void disp(){
        System.out.println("disp method of child class B8 ");
    }
}
// Class B8 and Class A8 are in IS_A relantionship, therefore return type change is allowed
//

class Human{
    public void sleep(){
        System.out.println("Human sleeps");
    }
    public A8 eat(){
        System.out.println("Human eats");
        A8 a8=new A8();
        a8.disp();
        return a8;
    }
}
class Employee extends Human{
    public void sleep(){
        System.out.println("Employee sleeps");
    }
    public B8 eat(){ //child class is the return type not parent class
        System.out.println("Employee eats");
        B8 b8=new B8();
        b8.disp();
        return b8;
    }
}
public class Inheritance8 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.sleep();
        e.eat();
    }
}
