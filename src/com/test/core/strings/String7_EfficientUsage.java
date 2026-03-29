package com.test.core.strings;

public class String7_EfficientUsage {
    static void main() {
        //which string to use and when?
        //"", new, string buffer, string builder

        //reverse string
        String s1="Telusko";
        String s2="";

        for (int i=s1.length()-1; i >= 0; i--){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("The reversed string "+s2);
        //for every + a string will be created, therefore 8 string gets created in heap
        //therefore we must use stringbuffer and stringbuilder , as they are mutable

    }
}
