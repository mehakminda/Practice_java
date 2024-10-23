package com.test.oops.polymorphism;

/**method-overloading: 
1.same method name, 
2. different parameter, 
3. different order of parameter, 
4. return type can be same/different

*/
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		CompileTimePolymorphism obj=new CompileTimePolymorphism(); //we had to create obj coz its method are not static 
		obj.add();
		
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(4.5,5.5));
		System.out.println(obj.add(4.5,10));
		System.out.println(obj.add(10,4.5));

	}
	public void add() {
		int x=4;int y=5;
		System.out.println(x+y);
	}
	public int add(int x,int y) {
		return x+y;
	}
	public double add(double x, double y) {
		return x+y;
	}
	public double add(int x, double y) {
		return x+y;
	}
	public double add(double x, int y) {
		return x+y;
	}
}
/*
 * Can we overload Main method - yes, but JVM will call main which has string args[]*/
