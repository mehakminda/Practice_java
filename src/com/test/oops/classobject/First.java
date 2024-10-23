package com.test.oops.classobject;

class Student{
	int id; // instance variable/class variable (heap)
	int age;
	String name;
	void learn(){
		int year =2024; //method variable/reference variable/local variable (stack)
		System.out.println("Is Learning Java");
	}
}

public class First {

	public static void main(String[] args) { 
	
		Student s=new Student(); //reference variable (heap)
		s.learn(); //method call- stack frame

	}

}
