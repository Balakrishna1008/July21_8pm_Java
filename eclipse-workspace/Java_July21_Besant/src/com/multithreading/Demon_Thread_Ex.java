package com.multithreading;

public class Demon_Thread_Ex {

	public static void main(String[] args) {

		Daemonthread dt = new Daemonthread();
		dt.setDaemon(true);
		dt.start();
		
		System.out.println("Main Thread is executing");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Daemonthread extends Thread{
	
	public void run() {
		while(isDaemon() == true) {
			System.out.println("Daemon thread is Running");
			
			try{
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}
