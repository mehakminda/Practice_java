package com.test.oops.inheritance;

/*
How do variable behave in inheritance
 */
class Demo3{
    int a=10;
    void disp(){
        System.out.println("disp() of parent");
    }
}
class Demo32 extends Demo3{
    int a=20;
    void disp(){
        System.out.println(a); //20
        System.out.println(this.a); // 20
        System.out.println(super.a); //10
        super.disp();
    }
}
public class Inheritance3 {
    public static void main() {

        Demo32 d32=new Demo32();
        d32.disp();


        System.out.println("----------------");

        Demo3 d3=new Demo32();
        d3.disp();

        System.out.println("----------------");

        /*Demo32 d322=new Demo3();
        d322.disp();*/
        //giving error


    }
}
