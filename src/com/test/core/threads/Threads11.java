package com.test.core.threads;

/***
 * Producer and Consumer problem: Provides solution to deadlock which used synchronization incorrectly
 *Here we make use of wait() and notify() method
 *
 * Producer(produces data) --(put)--> Queue --(get)--> Consumer(consumes data)
 *
 * Any thread in wait state will come out, only if it is in notify state.
 */

class MyQueue{
	int i;
	boolean valueSet=false;
	public synchronized void put(int x) {
		if(valueSet){
            try {
				System.out.println("Producer waiting..");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
		else{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.i=x;
			System.out.println("Producer added data to queue: "+i);
			valueSet=true;
			notify();
		}
	}
	public synchronized void get() {
		if(!valueSet){
			try {
				System.out.println("Consumer waiting..");
				wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		else{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("Consumer data from queue     : "+i);
			valueSet=false;
			notify();
		}
	}
}

class Producer implements Runnable{
	MyQueue q;
	public Producer(MyQueue q) {
		this.q=q;
	}
	public void run(){
		int i=1;
		while(true){
			q.put(i++);
		}
	}
}
class Consumer implements Runnable{
	MyQueue q;
	public Consumer(MyQueue q) {
		this.q = q;
	}
	public void run(){
		while(true){
			q.get();
		}


	}
}
public class Threads11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q=new MyQueue();

		Producer p=new Producer(q);
		Consumer c=new Consumer(q);

		Thread t1=new Thread(p);
		Thread t2=new Thread(c);

		t1.start();
		t2.start();

	}
}

//Not sure why its printing alternative numbers..check
