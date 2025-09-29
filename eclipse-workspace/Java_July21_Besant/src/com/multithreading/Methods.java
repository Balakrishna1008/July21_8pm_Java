package com.multithreading;

public class Methods {

	public static void main(String[] args) {

		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		Mythread t3 = new Mythread();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Mythread extends Thread{
	
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Count "+ i + " " + Thread.currentThread().isAlive() + " " + getName() +" " +  getPriority());
			try {
				Thread.sleep(999); // makes the thread to wait for the given milliseconds
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
		System.out.println(Thread.currentThread().isAlive());
	}
}