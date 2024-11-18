package com.test.advance.threads;

import java.util.Scanner;

class Alpha1 extends Thread
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


class Beta1 extends Thread
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


class Gamma1 extends Thread
{
	public void run() 
	{
		System.out.println("displaying important message Activity started...");
		for(int i=0;i<4;i++)
		{
			System.out.println("Focus is the key");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("displaying important message activity ended...");
	}
}


public class Threads4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha1 a=new Alpha1();
		Beta1 b=new Beta1();
		Gamma1 g=new Gamma1(); //create a stack frame and a thread

;

		a.start(); // gives life to thread by handling it to thread scheduler
		b.start();
		g.start();
		
		//we do not call run method
	}
}
