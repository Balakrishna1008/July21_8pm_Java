package com.java8plus_features;

import java.time.*;
import java.time.format.DateTimeFormatter;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;

public class Date_Time {

	public static void main(String[] args) {
		
		//current
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		//custom
		LocalDate mydate = LocalDate.of(2002,8,18);
		System.out.println(mydate);	
		
		//add or subtraction 
		LocalDate nextYear = LocalDate.now().plusYears(4);
		System.out.println(nextYear);
		
		LocalDate nextDate = LocalDate.now().plusDays(29);
		System.out.println(nextDate);

		
		//Date format
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		String format = current.format(f);
		System.out.println(format);
		
		//Date difference
		
	}
}
