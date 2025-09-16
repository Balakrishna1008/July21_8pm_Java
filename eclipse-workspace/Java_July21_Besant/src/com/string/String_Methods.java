package com.string;

public class String_Methods {

	public static void main(String[] args) {
	    
		String car = "Tata is the car Brand ";  // String literal
		System.out.println(car.length());
		System.out.println(car.indexOf('T'));  // finding the position using index
		System.out.println(car.toUpperCase());
		System.out.println(car.toLowerCase());
		System.out.println(car.charAt(2));
		System.out.println(car.indexOf('B'));
		System.out.println(car.indexOf('a'));
		System.out.println(car.lastIndexOf('a'));
		System.out.println(car.startsWith("Tata"));
		System.out.println(car.endsWith("Brand "));
		System.out.println(car.replace('a', 'z'));
		System.out.println(car.isEmpty());
		System.out.println(car.contains("cars"));
		System.out.println(car.repeat(3));
		System.out.println(car.trim());
		
		// equals method
		
		String vehicle = "Tata is the car Brand "; // String literal
		System.out.println(car.equals(vehicle));
		System.out.println(car.equalsIgnoreCase(vehicle));
		
		String transport = new String( "Tata is the car Brand "); // String is created similar to the object
		String transport1 = new String( "Tata is the car Brand "); // String is created similar to the object
		
		System.out.println(car.equals(transport));   // true // .equals is going to compare only the string values
		
		System.out.println(car == transport); // false 
		
		System.out.println(car == vehicle); // true  
		
		System.out.println(transport1 == transport); // false
		
		
	// 3/09/2025
		
	// --------------------------------
		
		
		//  String concatenation
		
	String fName = "Sowndharya  ";
	String lName = "Vignesh";
	int age = 29;
	
	String fullName = fName + lName;  // concating using + operator
	System.out.println(fullName);
	
	String Name = fName.concat(lName); // concating using .concat method
	System.out.println(Name);
	
	String result = fName + age;
	System.out.println(result);
	
	// String special characters
	
	String text = "This is \"Java\" code";
	System.out.println(text);
	
	
	// 4/09/2025
		
		
		
		
		
	}

}
