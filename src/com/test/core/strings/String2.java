package com.test.core.strings;

public class String2 {
    static void main() {

        //proof of scp vs heap
        String s1="Java"; //String constant pool , has direct literal (ie) " "
        String s2="Ja"; //String constant pool
        String s3="va"; //String constant pool
        String s4= s2+s3; //Heap : anything other than ""
        String s5="Ja"+"va"; //String constant pool , has direct literal (ie) " "

        System.out.println(s1==s4); //false one is in scp and other in heap
        System.out.println(s1==s5);// true, as both in scp


        System.out.println("-----------------------------");
        //immutability in heap also?
        String s6=s2+s3;
        System.out.println(s4==s6); //no 2 different objects are created
        //duplicate can exists in heap
    }

}
/**
 *  all direct literal are stored in scp
 *  whenever there is reference variable/method/+/new used in assignment then the string reference
 *  will change to point to heap memory. (a copy of that string word will be present in scp too)
 *
 * in scp duplicates are not allowed
 *
 *  eg:
 *  scp has: Java, Ja, va,
 *  heap has: Java
 *
 *  eg2: str1="mehak"
 *  str2="minda"
 *  str3=str1+str2
 *
 *  scp: mehak, minda, mehakminda
 *  heap: mehakminda
 *
 *  mehakminda object will be created in both heap and scp, but the str3 will point to heap one
 */


