package com.test.oops.constructors;


class Student{
	private int id;
	private String name;
	private int age;
	
	
	//parametertized constructor
	public Student(int id1,String name1, int age1) { // no return type
			id=id1;	
			name=name1;
			age=age1;
			System.out.println("parametertized constructor");
	}
	

	//zero-parametertized constructor
	public Student() { // no return type
		System.out.println("zero-parametertized constructor ");
	}
	
	
	public void getId() {
		System.out.println("Id value is: "+id);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.getId();
		Student s2=new Student(1,"Mehak",28);
		s2.getId();

	}

}
