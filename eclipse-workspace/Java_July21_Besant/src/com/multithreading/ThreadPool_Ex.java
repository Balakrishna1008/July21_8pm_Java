package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_Ex {

	public static void main(String[] args) {
		
//		ExecutorService executor = Executors.newFixedThreadPool(5); // 
//		ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor = Executors.newSingleThreadExecutor(); // completed one by one manner
		
		for(int i=1; i<=15; i++) {
			Runnable task = new Worker("Task : " + i);
			executor.execute(task);
		}
		
		executor.shutdown();
	}

}

class Worker implements Runnable{

	String taskName;
	
	Worker(String taskName){
		this.taskName = taskName;
	}
	public void run() {
		System.out.println(taskName + " is executed by : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(taskName + " is completed by : " + Thread.currentThread().getName());
	}
	
}