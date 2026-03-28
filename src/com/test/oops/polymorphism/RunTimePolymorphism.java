package com.test.oops.polymorphism;

//method overriding

class A{
	public void m1(){
		System.out.println("Class A m1");
	}
	public void m2(){
		System.out.println("Class A m2");
	}
}

class B extends A{
	public void m1(){
		System.out.println("Class B m1");
	}
	public void m2(){
		System.out.println("Class B m2");
	}
}

class C extends A{
	public void m1(){
		System.out.println("Class C m1");
	}
	public void m2(){
		System.out.println("Class C m2");
	}
}
class X{
	public void methodxyz(A a){
		a.m1();
		a.m2();
	}
}

public class RunTimePolymorphism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B(); b.m1(); b.m2();
		C c=new C(); c.m1(); c.m2();

		A a=b; a.m1(); a.m2();
		A a1=c; a1.m1(); a1.m2();

		System.out.println("..................");
		X x=new X();
		A a2=new A();
		x.methodxyz(a2);
		x.methodxyz(b);
		x.methodxyz(c);

	}

}
