package com.multithreading;

public class Thread_States {

	public static void main(String[] args) {

		ExampleThread e1 = new ExampleThread();
		ExampleThread e2 = new ExampleThread();
		ExampleThread e3 = new ExampleThread();
		
		e1.setName("Thread 1");
		e2.setName("Thread 2");
		e3.setName("Thread 3");
		
		System.out.println("Thread state before starting : " + e1.getState());
		System.out.println("Thread state before starting : " + e2.getState() );
		System.out.println("Thread state before starting : " + e3.getState());

		e1.start();
		e2.start();
		e3.start();
		
		System.out.println("Thread state after starting : " + e3.getState());
		System.out.println("Thread state after starting : " + e3.getState());
		System.out.println("Thread state after starting : " + e3.getState());

	}

}

class ExampleThread extends Thread{
	public void run() {
		System.out.println("Thread is running "+ Thread.currentThread().getName());
	}
//	System.out.println(e1.getstate());
}
