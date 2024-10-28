package com.test.oops.constructors;


//parent class has non-parameetrized constructor
class A5{
	public A5() {
		System.out.println("Parent class constructor");
	}
}
class B5 extends A5{

	public B5() {
		this(4); //call the parametrized constructor of same class
		System.out.println("zero parameter constructor");
	}
	public B5(int x) {
		//super();
		System.out.println("1 parameter constructor");
		
	}
}

public class SuperThis5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B5 b1=new B5();
		B5 b2=new B5(10);
	}

}
