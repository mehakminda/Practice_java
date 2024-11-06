package com.test.oops.constructors;


//parent class has non-parameetrized constructor
class A6{
	public A6() {
		System.out.println("Parent class constructor");
	}
}
class B6 extends A6{

	public B6() {
		this(4); //call the parameterized constructor of same class
		// super(); is called even before this call
		System.out.println("zero parameter constructor");
	}
	public B6(int x) {
		//super();
		System.out.println("1 parameter constructor");
		
	}
}

public class SuperThis6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B6 b1=new B6();
		B6 b2=new B6(10);
	}

}
