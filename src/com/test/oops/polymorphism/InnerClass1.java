package com.test.oops.polymorphism;


//https://www.geeksforgeeks.org/java/inner-class-java/

 class OuterA{
     int num1; //package-private
    public void show(){
        System.out.println("A show method");
    }

    //Member Inner Class
     class B{
        public void m1(){
            System.out.println("m1: access private variable "+ num1);
        }
        public void m2(){
            System.out.println("m2");
        }
    }

    //Static inner class
    static class C{
        public  void m1(){
            System.out.println("m1: access private variable ");
        }
    }

    //Static inner class having static method
    static class D{
        public static void m1(){
            System.out.println("m1: access private variable ");
        }

    }
}
public class InnerClass1 {
    static void main() {
        OuterA obj=new OuterA();
        obj.show();
        System.out.println(obj.num1);

        //Member Inner Class
        OuterA.B obj1=new OuterA().new B();
        obj1.m1();

        //static inner class
        OuterA.C obj2= new OuterA.C();
        obj2.m1();

        OuterA.D.m1();




    }
}
/**
 * file name saved are
 * A.class
 * A$B.class
 * A$C.class
 */

/*
Type of inner class:
Member Inner Class( non-static)
Method-Local Inner Class( non-static)
Static Nested Class
Anonymous Inner Class ( non-static)
 */