package com.test.oops.constructors;

//parent class has non-parameetrized constructor
class A{
	public A() {
		System.out.println("Parent class constructor");
	}
}
class B extends A{

	public B() {
		//super(); //by default super is present as first line for all constructor, this super() calls parent class 0 parameter contructor of parent
		System.out.println("zero parameter constructor");
	}
	public B(int x) {
		//super();
		System.out.println("1 parameter constructor");
		
	}
}

public class SuperThis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		B b2=new B(10);

	}

}
