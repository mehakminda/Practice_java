package com.test.core.strings;

public class String1 {
    static void main() {
        String s1="Hello"; //Immutable
        String s2="Hello";

        String s3=new String("Hello"); //Immutable
        String s4=new String("Hello");

        System.out.println(s1==s2); //true //reference comparison
        System.out.println(s3==s4); //false


        System.out.println(s1.equals(s2)); //true  //value comparison
        System.out.println(s3.equals(s4)); //true


        System.out.println(s1);
        //by default print the object gives address of reference variable
        //to get value we need to implement toString
        //Here we are getting value coz by default the String class have toString method implementation
    }
}
/**
 * Immutable: StringBuffer, StringBuilder
 * Mutable: new String, ""
 */
