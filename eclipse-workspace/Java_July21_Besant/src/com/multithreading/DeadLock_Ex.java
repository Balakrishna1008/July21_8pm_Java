package com.multithreading;

public class DeadLock_Ex extends Thread{
	
	One obj1;
	Two obj2;
	
	DeadLock_Ex(One obj1, Two obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void run() {
		obj1.method1(obj2);
		
	}

	public static void main(String[] args) {
		
		One d1 = new One();
		Two d2 = new Two();
		
		DeadLock_Ex t1 = new DeadLock_Ex(d1,d2);
		ChildThread t2 = new ChildThread(d1,d2);
		
		t1.start();
		t2.start();
		
	}

}

class ChildThread extends Thread{
	
	One obj1;
	Two obj2;
	
	ChildThread(One obj1, Two obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void run() {
		obj2.method3(obj1);
		
	}

}

class One{
	
	 void method1(Two obj2) {
		System.out.println("Method 1");
//		Two obj2 = new Two();
		obj2.method4();
		
	}
	
	synchronized void method2() {
		System.out.println("Method 2");
	}
}


class Two {
	
	synchronized void method3(One obj1) {
		System.out.println("Method 3");
//		One obj1 = new One();
		obj1.method2();
	}
	
	synchronized void method4() {
		System.out.println("Method 4");

	}
}