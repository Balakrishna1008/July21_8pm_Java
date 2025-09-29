package com.multithreading;

public class Join_Ex1 {

	public static void main(String[] args) {
		
		System.out.println("Main thread is starting");
		Jointhread j1 = new Jointhread();
		
		j1.setName("Child Thread");
		j1.start();
		
		System.out.println("Main thread is waiting for chikd thread");
//		try{
//			j1.join(); // main thread is going to wait until my j1 completes
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}
		
		System.out.println("Main thread continues after child thread completes");
	}

}

class Jointhread extends Thread{
	public void run() 
	{
		for(int i=1; i<=4; i++) 
		{
			System.out.println(getName() + " : " + i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
			}
		}
		
		System.out.println(getName() + " finished");
	}
	
	
}
