package com.test.core.strings;

public class String4vsfinal {
    static void main() {
        //strings Immutability  and final variable

        String str1="Telusko";
        str1="Java";
        //telusko object value in scp of heap cannot be changed but a new object with java
        //will be created. str1 will point to new java  object from telusko object.

        final int a=10;
        //a=20;//error , as changing value is not allowed.

    }
}
