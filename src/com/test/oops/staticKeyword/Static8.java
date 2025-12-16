package com.test.oops.staticKeyword;

/**
 * will static block be called multiple time, if we create multiple objects of that class
 */
class MultiObject{
    static{
        System.out.println("Static block ");
    }
}
public class Static8 {
    public static void main(String[] args) {
        MultiObject m1=new MultiObject();
        MultiObject m2=new MultiObject();
        MultiObject m3=new MultiObject();
    }
}
