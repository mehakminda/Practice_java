package com.test.designPattern.Behavioral.observer.concept;

class A{
    public A() {
        System.out.println("Hello I am A");
    }
}

 abstract class Test{
    A a;
     public Test(A a) {
         this.a=a;
         System.out.println("Test");
     }
 }

 class JavaClass1 extends Test{
    public JavaClass1(A a) {
        super(a);
        System.out.println("Java Class1");
    }
}
public class JavaClassMain{
    public static void main(String[] args) {
            A a=new A();
            JavaClass1 jc1=new JavaClass1(a);
    }
}
