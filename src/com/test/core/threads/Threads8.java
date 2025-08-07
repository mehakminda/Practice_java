package com.test.core.threads;

/**
 * Synchronize: Applying lock to a resource
 * using synchronized method/synchronized block.
 */

class CarShare1 implements Runnable{
	//synchronized public  void run(){
	public  void run(){

		try {
			System.out.println(Thread.currentThread().getName()+ " Has entered the parking lot");
			Thread.sleep(4000);
			synchronized(this) {
				System.out.println(Thread.currentThread().getName() + " Has Got into Car");
				Thread.sleep(4000);
				System.out.println(Thread.currentThread().getName() + " Started to drive car");
				Thread.sleep(4000);
				System.out.println(Thread.currentThread().getName() + " Came back from the drive and parked the car");
				Thread.sleep(4000);
				System.out.println(Thread.currentThread().getName() + " Came out of parking lot");
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}


	}

}public class Threads8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShare1 cs=new CarShare1();

		Thread t1=new Thread(cs,"CHILD-1");
		Thread t2=new Thread(cs,"CHILD-2");
		Thread t3=new Thread(cs,"CHILD-3");

		t1.start();
		t2.start();
		t3.start();

	}

}
