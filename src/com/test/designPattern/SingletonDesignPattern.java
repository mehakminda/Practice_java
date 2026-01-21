package com.test.designPattern;

/**
 * https://www.geeksforgeeks.org/system-design/singleton-design-pattern/
 * The Singleton Design Pattern ensures that a class has only one instance and provides a global access point to it.
 * static member, private constructor,
 */

class Singleton{
    public String str;
    private static Singleton instance;
    private Singleton(){ }
    public static Singleton getSingleInstance(){
        if(instance == null){
            instance = new Singleton();
        } return instance;
    }
}
public class SingletonDesignPattern {
}
