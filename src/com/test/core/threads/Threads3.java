package com.test.core.threads;

import java.util.Scanner;

/*
 * Create threads using Runnable interface
 *
 */

class Alpha implements Runnable
{
	public void run()
	{
		System.out.println("Banking Activity started...");

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the account number");
		int accNo=scan.nextInt();
		System.out.println("please enter the password");
		int password=scan.nextInt();
		System.out.println("Login success!");
		System.out.println("Banking Activity ended...");
		System.out.println("********************");
	}
}


class Beta implements Runnable
{
	public void run()
	{
		System.out.println("printing number Activity started...");
		for(int i=0;i<5;i++)
		{
			System.out.println("The new generated number is : "+ i);
		}
		System.out.println("printing number Activity ended...");
		System.out.println("********************");
	}
}


class Gamma implements Runnable
{
	public void run() 
	{
		System.out.println("displaying important message Activity started...");
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is the key");
		}
		System.out.println("displaying important message activity ended...");
	}
}


public class Threads3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=new Alpha();
		Beta b=new Beta();
		Gamma g=new Gamma();

		//		a.banking();
		//		b.printingNumber();
		//		g.printingMessage();

		Thread thread1=new Thread(a); //create a stack frame and a thread
		Thread thread2=new Thread(b);
		Thread thread3=new Thread(g);

		thread1.start();// gives life to thread by handling it to thread scheduler
		thread2.start();
		thread3.start();
	}
}
