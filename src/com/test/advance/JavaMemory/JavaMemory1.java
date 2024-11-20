package com.test.advance.JavaMemory;

import java.util.ArrayList;

public class JavaMemory1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int x=1; //primitive datatype : stack
		String y="Mehak"; //Object : heap
		ArrayList<String> arrList=new ArrayList<String>();//arrList is an Object hence in heap
		arrList.add("one"); 
		/* this inferred as arrList.add(new String("one"));
		 * so a new string object is created in heap having value "one"
		 * arr.get(0) holds the reference of above string object one
		 * 
		*/
		arrList.add("two"); 
		arrList.add("three"); 
	}

}
