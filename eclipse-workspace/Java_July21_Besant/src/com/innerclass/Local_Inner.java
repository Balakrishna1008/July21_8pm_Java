package com.innerclass;

public class Local_Inner {

	public static void main(String[] args) {

		Exam ex = new Exam();
		ex.outermethod(); 
		
	}

}

class Exam{
	
	void outermethod() {
		
		class Paper{
			void result() {
				System.out.print("Passed");
			}
		}
		
		Paper p = new Paper(); // The object for LocalInner class should be created and called here, and can be accessed inside the Outer class
		p.result();
	}
}