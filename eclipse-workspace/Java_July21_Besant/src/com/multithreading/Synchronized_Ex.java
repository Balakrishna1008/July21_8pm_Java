package com.multithreading;

public class Synchronized_Ex {

	public static void main(String[] args) {
		
		Web obj1 = new Web();
		Web obj2 = new Web();
		Web obj3 = new Web();
		
		Users user1 = new Users(obj1,"User 1");
		Users user2 = new Users(obj2,"User 2");
		Users user3 = new Users(obj3,"User 3");
		
		user1.start();
		user2.start();
		user3.start();
	}

}

class Web{
	static synchronized void show(String name) {
		for(int i = 1; i<=5; i++) {
			System.out.print("Welcome ");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(name);
		}
	}
}

class Users extends Thread{
	
	Web obj;
	String name;
	
	Users(Web obj, String name){
		this.obj = obj;
		this.name = name;
	}
	public void run() {
		
//		System.out.println("");
		Web obj = new Web();
		obj.show(name);
	}
	
	
}
