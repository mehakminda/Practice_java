package com.test.oops.constructors;


class Employee{
	private int id;
	private String name;
	private int age;
	
	//method1: getter/setter
	public void setId(int id1) {
		id=id1;
	}
	public void getId() {
		System.out.println("Set by setter: "+id);
	}
}

class Employee2{
	private int id;
	private String name;
	private int age;
	
	//method2- constructor/specialized setter
	//parametertized constructor
	public Employee2(int id1,String name1, int age1) { // no return type
		id=id1;	
		name=name1;
		age=age1;
	}
	public void getId() {
		System.out.println("Set by constructor: "+id);
	}
}

public class ConstructorBasics {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		//e.id=10; // fails, as id is private variable, hence we use setter/constructor
		e.setId(10);
		e.getId();
		
		Employee2 e2=new Employee2(10, "Mehak",20);
		e2.getId();
		
	}
}


/*
 * If for a class, constructor is not present, then javac will add a default constructor , 
 * default constructor doesnt have any argument
 * */
