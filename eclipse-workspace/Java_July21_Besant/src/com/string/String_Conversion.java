package com.string;

public class String_Conversion {

	public static void main(String[] args) {
 
          // String =>  String buffer
		
		String text = " Hello everyone";
		System.out.println("String :" + text);
		
		StringBuffer sb = new StringBuffer(text); // String => string Buffer
		System.out.println("String Buffer :" + sb);
		
		
		// String => String Builder
		
        StringBuilder sbd = new StringBuilder(text);
        System.out.println("String Builder : " + sbd);
        
        
        // buffer  => string
        
        StringBuffer sb1 = new StringBuffer("Today is monday");
        System.out.println("String Buffer : " + sb1);
        
        String day = sb1.toString();
        System.out.println("String : " + day);
        
        // builder => string
        
        StringBuilder sbd1 = new StringBuilder("Today is monday");
        System.out.println("String builder :" + sbd1);
        
        String day1 = sbd1.toString();
        System.out.println("String : " + day1);
        
        // String builder => string buffer
        
         StringBuilder s = new StringBuilder("Java class");
         System.out.println("String Builder :" +s);
         
        String course = s.toString();               // intermediate
        System.out.println("String : " +course); // intermediate 
        
        StringBuffer sb2 = new StringBuffer(course);
        System.out.println("String Buffer :" + sb2);
        
        // String buffer => string builder
        
        StringBuffer s1 = new StringBuffer("Java class");
        System.out.println("String Buffer : " + s1);
        
        String course1 = s1.toString();             // intermediate
        System.out.println("String : " + course);    // intermediate
        
        StringBuilder sb3 = new StringBuilder(course1);
        System.out.println("String Builder :" + sb3);
        
		}

}

// 8/09/2025

