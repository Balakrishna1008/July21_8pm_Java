package com.Filehandling;

import java.io.*;
import java.util.*;
public class Methods {

	public static void main(String[] args) {
		
		// create new file 
		File file = new File("Example2.txt");
//		
		try {
			if(file.createNewFile()) {
				System.out.println("File has been created");
			}else {
				System.out.println("File already exists");
			}
			
		}catch(IOException e){
			System.out.println(e);
			
		}
		
		
		// write a content in file
		
		 try { 
			  FileWriter fw = new FileWriter("Example2.txt");
			  fw.write("Hello Everyone"); 
			  fw.append("\nThis is Balakrishnan"); // if want to add extra content, use append method
			  System.out.println("Content has been written"); 
			  fw.close();
		  
		  }
		  catch(IOException e) {
			  System.out.println(e); 
		  }
		 
		// read a content in a file through character by character
		
		try {
			FileReader fr = new FileReader("Example2.txt");
			int character;
			while((character = fr.read()) != -1) {
				System.out.println((char)character);
			}
			
			fr.close();
			System.out.println("file read");
			
		}catch(IOException e) {
			System.out.println(e);
		}
//		
		
		// read the input using scanner class through word by word
		
		try {
			Scanner sc = new Scanner(file);

			while(sc.hasNext()) {
				
				String word = sc.next();
				System.out.println(word);
			}
			
			sc.close();
			System.out.println("file read");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//To delete a file 	
		
		if(file.delete()) {
			System.out.println("File deleted");
		}else {
			System.out.println("File not present or already deleted");
		}
		
		
		// Buffered writer 
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Example1.txt"));
			bw.write("How are you");
			bw.newLine();
			bw.append("Hope doing fine ");
			System.out.println("File has been created");
			bw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
		// buffered reader
		try {
			BufferedReader br = new BufferedReader(new FileReader("Example1.txt"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
		}
		catch(IOException e) {
			System.out.println(e);		}
	}
	

}
