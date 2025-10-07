package com.multithreading;

public class WaitandNotify_Ex {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		CustomerThread customer = new CustomerThread(order);
		ShopThread shop = new ShopThread(order);
		
		// priority is used to run which method should be executed first, but sometimes it may give false output		
		customer.setPriority(10); 
		shop.setPriority(1);
		
		shop.start();
		customer.start();
		
	}

}

class Order{
	
	boolean isReady = false;
	
	synchronized void placeOrder() {
		System.out.println("Customer ordered the bag and waiting");	
	
		try{
			wait() ;
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Customer got the bag");
	}
	
	synchronized void prepareOrder() {
		System.out.println("Shop owner received the order and Stared to prepare");
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		isReady = true;
		System.out.println("Bag is ready");
		notify();
	}
}

class CustomerThread extends Thread{
	
	Order order;
	
	CustomerThread(Order order){
		this.order = order;
	}
	
	public void run() {
		order.placeOrder();
	}
}

class ShopThread extends Thread{
	
	Order order;
	
	ShopThread(Order order){
		this.order = order;
	}
	public void run() {
		order.prepareOrder();
	}
}