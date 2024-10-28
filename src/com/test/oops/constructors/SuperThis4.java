package com.test.oops.constructors;


//parent class has non-parameetrized constructor
class A4{
	public A4() {
		System.out.println("Parent class constructor");
	}
}
class B4 extends A4{

	public B4() {
		//this(); //not allowed recursive method invocation
		//super will be called here
		System.out.println("zero parameter constructor");
	}
	public B4(int x) {
		this(); 
		//super is overridden by this
		System.out.println("1 parameter constructor");
		
	}
}

public class SuperThis4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 b1=new B4();
		B4 b2=new B4(10);
	}

}
