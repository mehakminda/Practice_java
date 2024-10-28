package com.test.oops.constructors;

//parent class has both parameterized and non-parameetrized constructor

class A3{
	public A3() {
		System.out.println("Parent class 0 parameter constructor: ");
	}
	public A3(int x) {
		System.out.println("Parent class 1 parameter constructor: "+x);
	}
}
class B3 extends A3{

	public B3() {
	
		System.out.println("zero parameter constructor");
	}
	public B3(int x) {

		//super(5); //override  super();
		System.out.println("1 parameter constructor");
		
	}
}

public class SuperThis3 {
	B3 b1=new B3();
	B3 b2=new B3(10);


}
