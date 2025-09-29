package com.multithreading;

public class Ex2_RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example e1 = new Example(); // creating runnable object(simple object)
		Thread tA = new Thread(e1); // creating thread class and passing the runnable object 
		Thread tB = new Thread(e1);
		Thread tC = new Thread(e1);
		Thread tD = new Thread(e1);
		Thread tE = new Thread(e1);
		
		tA.start();
		tB.start();
		tC.start();
		tD.start();
		tE.start();
//		tA.start();
		

	}

}


class Example implements Runnable{
	 
	public void run() {
		System.out.println("Thread is Running " + Thread.currentThread().getName());
	}
}