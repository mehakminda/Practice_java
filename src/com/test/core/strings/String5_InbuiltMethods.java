package com.test.core.strings;

public class String5_InbuiltMethods {
    static void main() {
        //CompareTo() : returntype is int(+ve, -ve,0)
        //comapre lexigographically(alphabetical order) (i.e) ascii value char by char
        //==, equals: return type is boolean

        System.out.println("sachin".compareTo("sachin")); //0
        System.out.println("Sachin".compareTo("sachin")); //-32
        System.out.println("sachin".compareTo("Sachin")); //32
        System.out.println("10".compareTo("2")); //1 from 10 comes before 2
        //return the different in ascii value.
        //ASCII: A,B,C....a,b,c....
        System.out.println("sachin".compareTo("saurav")); //-18 from c and u difference
        System.out.println("sachin".compareTo("sachintendulkar")); //-9


        //compareToIgnoreCase
        System.out.println("----------CompareToIgnoreCase----------");
        System.out.println("sachin".compareToIgnoreCase("sachin")); //0
        System.out.println("Sachin".compareToIgnoreCase("sachin")); //0
        System.out.println("sachin".compareToIgnoreCase("Sachin")); //0
        System.out.println("10".compareToIgnoreCase("2")); //-1
        System.out.println("sachin".compareToIgnoreCase("saurav")); //-18 from c and u difference
        System.out.println("sachin".compareToIgnoreCase("sachintendulkar")); //-9


        //ToUpperCase()
        System.out.println("--------------------");
        String str1="Mehak Minda";
        str1.toUpperCase();
        System.out.println(str1); //str1 is not changed
        //in-place modification happens for arrays and not Strings
        //array and strings both are objects
        //strings are immutable, new string object gets created whenever there is a change
        //reference changes when assignment happens in string
        //array are modified as they are reference type**

        str1=str1.toUpperCase();
        System.out.println(str1);


        //intern()
        String s1=new String("Alpha");
        //s1 is pointing to the alpha present in heap area
        //although there is a copy of alpha created in scp

        String s2=s1.intern(); //explicitly telling to make s2 to point to alpha of scp
        String s3="Alpha";//scp
        System.out.println("Intern proof1: "+(s2==s1)); //false as s2 in heap, s1 in scp
        System.out.println("Intern proof2: "+(s2==s3)); //true





    }
}
