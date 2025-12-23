package com.test.oops.inheritance;

/**
 * We cannot reduce visibility but can increase the visibility during method overriding
 *
 * private can be made public
 */
class A7{
    private void disp(){
        System.out.println("disp of parent");
    }
}
class B7 extends A7{
    public void disp(){
        System.out.println("disp of parent");
    }
}
public class Inheritance7 {
    public static void main(String[] args) {

    }
}
