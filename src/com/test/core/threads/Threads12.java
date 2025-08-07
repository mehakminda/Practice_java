package com.test.core.threads;


/**
 * Daemon Thread:
 * Will execute atleast once at the end
 * We do not mention the termination point of daemon threads, but they still exits and doesnt go in infinite loop
 *
 * Garbage collection is a daemon thread
 */
class MSword implements Runnable
{
	@Override
	public void run()
	{
		String tName=Thread.currentThread().getName();
		if(tName.equals("TYPE"))
		{
			typing();
		}
		else if(tName.equals("SPELLCHECK"))
		{
			spellingCheck();
		}
		else
		{
			autoSave();
		}
	}

	public void typing()
	{
		for(int i=0;i<10; i++)
		{
			System.out.println("typing.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void spellingCheck()
	{
		for(;;)
		{
			System.out.println("spell checking.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void autoSave()
	{
		for(;;)
		{
			System.out.println("saving.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Threads12 {

	public static void main(String[] args) {
		MSword ms=new MSword();

		Thread t1=new Thread(ms);
		Thread t2=new Thread(ms);
		Thread t3=new Thread(ms);

		t1.setName("TYPE");
		t2.setName("SPELLCHECK");
		t3.setName("SAVE");

		t2.setDaemon(true);
		t3.setDaemon(true);

		//t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(3);

		t1.start();
		t2.start();
		t3.start();


	}

}
