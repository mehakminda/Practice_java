package com.test.core.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/***
 * Udemy - John Purcell
 *  Creating a thread is a overhead/costly process in terms of cpu memory utilization
 * By recycling the threads in thread pool we avoid that overheaad.
 *
 */
class Processor implements Runnable{
    int id;

    public Processor(int id){
        this.id=id;
    }

    public void run(){
        System.out.println("Starting Task: '"+id+"' by a thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ending Task: '"+id+"' by a thread: "+Thread.currentThread().getName());

    }
}
public class ThreadPool2 {
    public static void main(String args[]){
        ExecutorService executor= Executors.newFixedThreadPool(2); // create 2 workers in a factory

        // we have 5 task to be finished by 2 workers of factory.
        //task could be printing the content of 5 files using 2 threads..
        // common task is printing of file, there are 5 files, in each call we will send one file.
        // first 2 thread starts executing the file, then we wait for the thread to free up. only then the thirst file/task
        // is picked up for the task
        for(int i=0;i<5;i++){
            executor.submit(new Processor(i));
        }

        executor.shutdown();
        System.out.println("All Tasks submitted.");

        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        }

        System.out.println("All Tasks Completed.");


    }

}
