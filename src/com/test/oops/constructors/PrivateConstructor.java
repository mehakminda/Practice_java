package com.test.oops.constructors;

/**
 * Private Constructor : By providing a private constructor you prevent class instances from being created
 * in any place other than this very class.
 *
 * https://stackoverflow.com/questions/2062560/what-is-the-use-of-making-constructor-private-in-a-class
 *
 * 1. Your class instances are created in a static method. The static method is then declared as public
 * 2. Your class is a singleton. This means, not more than one instance of your class exists in the program
 * 3. (Only applies to the upcoming C++0x standard) You have several constructors. Some of them are declared public,
 * others private. For reducing code size, public constructors 'call' private constructors which in turn do all the
 * work. Your public constructors are thus called delegating constructors:
 * 4. You want to limit object copying (for example, because of using a shared resource):
 * 5. Your class is a utility class. That means, it only contains static members. In this case, no object instance must ever be created in the program.
 */

// 1. Your class instances are created in a static method. The static method is then declared as public
class Type1{
    private Type1(){
    }
    public static Type1 createInstance(){
        return new Type1();
    }
}


public class PrivateConstructor {
    public static void main(String[] args) {
            Type1 ty1=Type1.createInstance();
    }
}
