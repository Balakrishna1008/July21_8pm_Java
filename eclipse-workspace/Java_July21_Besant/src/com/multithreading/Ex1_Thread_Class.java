package com.multithreading;

public class Ex1_Thread_Class {

	public static void main(String[] args) {
		
		Sample t1 = new Sample(); // t1 is object (or) thread object
		
		Sample t2 = new Sample();
		
//		t1.setName("Thread A");
//		t2.setName("Thread B");
		
		t1.start();
		t2.start();
//		t1.run();

	}

}

// JVM => thread scheduler

class Sample extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is Running " + Thread.currentThread().getName()); // If you call getName without assigning name , it will auto-assign to thread as 0,1,.. like that.
	}
}
