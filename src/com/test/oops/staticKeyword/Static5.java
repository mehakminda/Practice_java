package com.test.oops.staticKeyword;

/**
 * In java, we are asked to created object of same class  in main inorder to access the non-static method
 *
 * because nonstatic member variables/methods cannot be used in static unless we create an object of those.
 * But non-static method can be used inside non-static method
 *
 * But we can directly call static method inside anotehr static method
 *
 *
 */
public class Static5 {
    void hello(){
        System.out.println("Hello ..Mehak");
    }
    void greetings(){
        hello(); //non-static method calling non-static method

    }
    static void introduce(){
        System.out.println("whats your name");
    }
    void name(){
        introduce(); //non-static calling static
    }

    public static void main(String[] args) {

        // hello();//note the error : on-static method 'hello()' cannot be referenced from a static context
        // static calling non-static

        introduce(); //static calling static

        Static5 st4=new Static5();
        st4.greetings();


    }
}
