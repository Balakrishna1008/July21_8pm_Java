package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Generic_Ex {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("Krish");
		names.add("100"); // Only String type can be used
		
		System.out.println(names);
	
	}

}
