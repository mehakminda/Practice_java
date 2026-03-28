package com.test.core.strings;

public class String3 {
    static void main() {
        // difference between + and concat

        String str1="Java";
        String str2= str1.concat("Telusko"); //method chaining is possible
        String str3=str1+str2+ " Mehak"+" Minda";

        //null value
        String str4=null;
        //String str5=str1.concat(str4); //null pointer exception
        //System.out.println(str5);
        String str6=str1+str4;
        System.out.println(str6); //Javanull


        //adding number to string variables
       // String str7=str1.concat(144);
        String str8=str1+"Mehak"+144;
        String str9=str1+99+100;
        System.out.println(str9); //Java99100

        String str10= 99+100+str1;
        System.out.println(str10); //199Java

        //String str11=100+99; //incorrect as it should be added to string object
    }
}
