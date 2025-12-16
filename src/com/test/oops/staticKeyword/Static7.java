package com.test.oops.staticKeyword;

/**
 *  default values for static and non-static member variables
 */

public class Static7 {
    static int count;
    int count1;
    public static void main(String[] args) {
        System.out.println(count);
        Static7 s7=new Static7();
        System.out.println(s7.count1);
    }
}
