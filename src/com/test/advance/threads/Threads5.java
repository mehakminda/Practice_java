package com.test.advance.threads;

import java.util.Scanner;


/*
 * Create 2 threads, identify their alive state before and after start method
 * also main thread will end only when both of these threads have finished their execution
 */
class Calc extends Thread
{
	@Override
	public void run() 
	{
		
		System.out.println("Calculation task started..");
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the first numer");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the second numnber");
		int num2=scan.nextInt();
		
		int res=num1+num2;
		System.out.println(res);
		System.out.println("Calculation task is completed");
	}
	
}

class Message extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Displaying important message started");
		for(int i=0;i<4; i++)
		{
			System.out.println("Focus is importamt to master the skills");
		}
		System.out.println("Displaying important message ended");
	}

}

public class Threads5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Main thread  started ");
		Calc c=new Calc();
		Message m=new Message();
		System.out.println(c.isAlive());//false : as threads are created only when we call start method
		System.out.println(m.isAlive());//false
		
//		c.run(); //will act as normal function
//		m.run();
		c.start();
		m.start();
		
		System.out.println(c.isAlive());//true
		System.out.println(m.isAlive());//true
		
		c.join();
		m.join();
				
		System.out.println("Main thread  done with its work ");

	}

}
