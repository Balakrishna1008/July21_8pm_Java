package com.methods;

	public class Private_Access {

		public static void main(String[] args) {
	          
	       Person p = new Person("java class");
	       
	       p.setName("Sowndharya");
	       System.out.println(p.getName());
	       
	       p.setAge(26);
	       System.out.println(p.getAge());
	       
    }

	   }

	class Person {
		
		
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}


        private String name;
		private int age;
		String email;
		
		public Person(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		private void display() {
			System.out.println("this is private " + name);
		}
		
		
		
		
		public void show() {
			display();
		}
	}


	// Encapsulation concept
	// 22/08/2025 
