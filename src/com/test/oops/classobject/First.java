package com.test.oops.classobject;

class Student{
	int id; // instance variable/class variable (heap)
	int age;
	String name;
	void learn(){
		int year =2024; //method variable/reference variable/local variable (run-time stack)
		System.out.println("Is Learning Java");
	}
}

public class First {

	public static void main(String[] args) { 
	
		Student s=new Student(); //reference variable (stack)
		s.learn(); //method call- stack frame

	}

}
/*
 * JVM starts execution from main, so control comes to main and loads the main in runtime stack
 * (ie) main method stack frame is created in runtime-stack area*/
