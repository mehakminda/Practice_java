package com.test.oops.polymorphism;

//method overriding

/**
 * class A= reference variable and object both of class A
 * new Class A()= object of class A
 */
class A{
	void m1(){
		System.out.println("m1 method of class A");
	}
	void m2(){
		System.out.println("m2 method of class A");
	}
}
class B extends A {
	void m1() {
		System.out.println("m1 method of class B");
	}

	void m3() {
		System.out.println("m3 method of class B");
	}
}

class C extends A {
	void m1() {
		System.out.println("m1 method of class C");
	}

	void m4() {
		System.out.println("m4 method of class C");
	}
}

class D extends A {
	void m1() {
		System.out.println("m1 method of class D");
	}

	void m5() {
		System.out.println("m5 method of class D");
	}
}

public class RunTimePolymorphism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B(); b.m1(); b.m2(); b.m3(); //m1 from class B called due to runtime polymorphism
		System.out.println("-------------------");
		C c=new C(); c.m1(); c.m2(); c.m4();
		System.out.println("-------------------");
		D d=new D(); d.m1(); d.m2();  d.m5();
		System.out.println("--------************-----------");
		A a=new A(); a.m1(); a.m2(); //((B) a).m3(); cannot be casted
		System.out.println("-------------------");
		A a1=b; a1.m1(); a1.m2(); ((B) a1).m3(); //m1 from class B called due to object is of class B
		System.out.println("-------------------");
		A a2=c; a2.m1(); a2.m2(); ((C) a2).m4();
		System.out.println("-------------------");
		A a3=d; a3.m1(); a3.m2(); ((D) a3).m5();



	}

}
