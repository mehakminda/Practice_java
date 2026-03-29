package com.test.core.strings;

public class String6_Mutable {
    static void main() {
        //StringBuffer: java 1.4
        //all methods had synchronized keyword
        //thread safe
        StringBuffer str1=new StringBuffer();
        System.out.println(str1);
        System.out.println(str1.capacity());

        StringBuffer str2=new StringBuffer("Java");
        System.out.println(str2);
        System.out.println(str2.capacity());//20 : 4(java)+16(default)

        StringBuffer str3=new StringBuffer();//16
        str3.append("Java"); //16-4=12
        str3.append(" is the best"); //12-12=0
        System.out.println(str3); //Java is the best
        System.out.println(str3.capacity());// 16
        str3.append(" and");
        System.out.println(str3); //Java is the best and
        System.out.println(str3.capacity());// 34
        //capacity:(old capacity*2+2)


        System.out.println("--------------------");
        StringBuffer str4=new StringBuffer("Mehak");
        StringBuffer str5=new StringBuffer("Mehak");
        System.out.println(str4==str5); //false, references are different
        System.out.println(str4.equals(str5)); //false , value is also different
        //this means in heap memory 2 different Mehak object is created
        //same for string builder
        //equals method come from Object class
        // equals method in string builder and string buffer is not overridden



        System.out.println("--------------------");


        //StringBuilder:
        StringBuilder s2=new StringBuilder("Java");
        System.out.println(s2);
        System.out.println(s2.capacity());//20

        //final has effect on only reference variable not objects
        //final on immutable and mutable ** interview
        final StringBuffer ss=new StringBuffer("Hello");
         ss.append("Hi"); //object
         //ss=ss.append("world"); //this will give error : reference variable
        System.out.println(ss);//value got changed



    }
}
