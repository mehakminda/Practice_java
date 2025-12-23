package com.test.oops.constructors;

//parent class has only parameterized constructor
class A2{
	
	public A2(int x) {
		System.out.println("Parent class 1 parameter constructor: "+x);
	}
	//since we have added a parameterized constructor, default 0-parameter constructor is not added by javac
}
class B2 extends A2{

	public B2() {
		super(3); //comment this line and check the error
		/*since there is no 0-parameter constructor in parent, it needs to be mentioned explicitly that which one we are calling*/
		System.out.println("zero parameter constructor");
	}
	public B2(int x) {

		super(5); //comment this line and check the error
		System.out.println("1 parameter constructor");

	}
}

public class SuperThis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b1=new B2();
		B2 b2=new B2(10);

	}

}
