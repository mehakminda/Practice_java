package com.test.advance.JavaMemory;

public class JavaMemory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int localvariable=10;
		CalcNumber(localvariable); //call by value
		
		/*
		 * when function is called a copy of local variable was created and stored in currvariable 
		 * all the modification were made to currvariable and the variabel is removed when function ends
		 * so no changes to localvariable is done
		 */
		System.out.println(localvariable); 

	}
	public static void CalcNumber(int currvariable) {
		currvariable=currvariable*10;
		System.out.println(currvariable);
	}

}
