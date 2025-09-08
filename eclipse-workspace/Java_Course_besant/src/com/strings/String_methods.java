package com.strings;

public class String_methods {

	public static void main(String[] args) {

		String car = "Tata Brand ";
		
		System.out.println(car.length());
		
		System.out.println(car.toUpperCase());
		System.out.println(car.toLowerCase());
		
		System.out.println(car.charAt(2));
		
		System.out.println(car.indexOf('a'));
		System.out.println(car.lastIndexOf('a'));
		
		System.out.println(car.startsWith("Tata"));
		System.out.println(car.endsWith("Brand"));
		
		System.out.println(car.replace('a','w' ));

		System.out.println(car.isEmpty());

		System.out.println(car.contains("Tata"));

		System.out.println(car.repeat(3));

		System.out.println(car.trim());
		
		String car1 = "Tata Brand ";
		
		String car2 = new String("Tata Brand ");
		String car3 = new String("Tata Brand ");
		
		System.out.println(car.equals(car1));
		System.out.println(car.equalsIgnoreCase(car1)); // does not consider whether upper/lower case --
		
		System.out.println(car.equals(car2));
		
		System.out.println(car == car1); // true because both are created using string method --
		System.out.println(car == car2); // false because "car" is created using string method and "car2" is created using string object --
	
		System.out.println(car2 == car3); // Will be false because " same content " but in different memory location -- 
	}

}
