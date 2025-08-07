package com.test.core.threads;

/**
 * Deadlock : Multiple threads trying to access the same resource and are struck.
 *
 *  Mutual cyclic dependency of resources
 *
 */

class Library1 implements Runnable{
	String res1= new String("Java");
	String res2= new String("DSA");
	String res3= new String("SpringBoot");

	public void run(){
		/*If we write synchronize to run method, it would mean that we are restricting students/threads to enter the library itself */
		String tname=Thread.currentThread().getName();
		if("Student1".equals(tname)){
			try {
				Thread.sleep(5000);
				synchronized(res1){
					System.out.println("Student1 has acquired res1: "+res1);
					Thread.sleep(5000);
					synchronized(res2){
						System.out.println("Student1 has acquired res2: "+res2);
						Thread.sleep(5000);
						synchronized(res3){
							System.out.println("Student1 has acquired res3: "+res3);
							Thread.sleep(5000);
						}
					}
				}
			} catch (InterruptedException e) {
				System.out.println("Some problem");
			}
		}
		else{
			try {
				Thread.sleep(5000);
				synchronized(res2){
					System.out.println("Student2 has acquired res2: "+res2);
					Thread.sleep(5000);
					synchronized(res1){
						System.out.println("Student2 has acquired res1: "+res1);
						Thread.sleep(5000);
						synchronized(res3){
							System.out.println("Student2 has acquired res3: "+res3);
							Thread.sleep(5000);
						}
					}
				}
			} catch (InterruptedException e) {
				System.out.println("Some problem");
			}
		}
	}
}
public class Threads10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library1 lib=new Library1();

		Thread t1=new Thread(lib);
		Thread t2=new Thread(lib);

		t1.setName("Student1");
		t2.setName("Studnet2");

		t1.start();
		t2.start();


	}

}
