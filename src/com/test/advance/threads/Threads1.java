package com.test.advance.threads;

import java.util.Scanner;

/*
 * Why do we need Threads?
 * Multiple activity are running which are independent of one another but until the first activity is not completed, the second activity 
 * is not executed.
 */

public class Threads1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Banking Activity started...");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the account number");
		int accNo=scan.nextInt();
		System.out.println("please enter the password");
		int password=scan.nextInt();
		System.out.println("Login success!");
		System.out.println("Banking Activity ended...");
		System.out.println("********************");
		
		
	
		System.out.println("printing number Activity started...");
		for(int i=0;i<5;i++)
		{
			System.out.println("The new generated number is : "+ i);
		}
		System.out.println("printing number Activity ended...");
		System.out.println("********************");
		
		
		
		System.out.println("displaying important message Activity started...");
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is the key");
			Thread.sleep(4000);
		}
		System.out.println("displaying important message activity ended...");
		

	}

}
