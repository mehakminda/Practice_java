package com.test.oops.staticKeyword;

/**
 * Static and Non-static methods
 *
 * In java, we are asked to create an object of same class  in main inorder to access the non-static method
 *
 * because non-static member variables/methods cannot be used in static unless we create an object of those.
 * non-static method can be used inside non-static method
 *
 * We can directly call static method inside another static method
 * We can also call static method insode non-static method
 * Main is a static method.
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

        st4.name();


    }
}
