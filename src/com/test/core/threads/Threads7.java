package com.test.core.threads;

/*
 * Concurrency problem: Multiple threads trying to access a single resource at a same time/concurently
 *
 * There is a car and 3 children who wanna drive the car
 * All three children cannot start and drive a single car at the same time.
 *
 */

class CarShare implements Runnable
{

	@Override
	public void run()
	{
		try {
		System.out.println(Thread.currentThread().getName()+ " Has entered the parking lot");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName()+ " Has Got into Car");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName()+ " Started to drive car");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName()+ " Came back from the drive and parked the car");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName()+ " Came out of parking lot");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}	
}

public class Threads7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CarShare cs=new CarShare();
		
		Thread t1=new Thread(cs);
		Thread t2=new Thread(cs);
		Thread t3=new Thread(cs);
		
		t1.setName("CHILD-1");
		t2.setName("CHILD-2");
		t3.setName("CHILD-3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
