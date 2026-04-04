package com.test.designPattern.creational.singleton;

public class SingletonClass {
    static void main() {
        ClassA a = ClassA.getInstance();
        ClassA b = ClassA.getInstance();

        //both a and b are referencing to one object only.

    }
}
class ClassA{
    static ClassA obj = new ClassA();
    private ClassA(){

    }
    public static ClassA getInstance(){
        return obj;
    }
}

/**
 * ClassA is singleton class
 * static ClassA type object
 * private constructor
 * static method that return classA type object
 */