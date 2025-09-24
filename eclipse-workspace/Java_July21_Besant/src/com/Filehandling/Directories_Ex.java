package com.Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directories_Ex {

	public static void main(String[] args) throws IOException {
		
//		File folder = new File("MyFolder");
//		
//		if(folder.mkdir()) // to create a directory, we can use mkdir() 
//		{
//			System.out.println("Folder has been created");
//		}else {
//			System.out.println("Folder exists");
//		}
		
		
		// creating folder inside folder
		
		File folder = new File("MyFolder/Folder 1/Folder 2");
		if(folder.mkdirs()) // to create multiple directories, we can use mkdirs() 
		{
			System.out.println("Folder has been created");
		}else {
			System.out.println("Folder exists");
		}
		
		File file = new File(folder,"Sample.txt"); // the sample file is created inside folder 
		if(file.createNewFile()) {
			System.out.println("File has been created");
		}else {
			System.out.println("File exists");
		}
	
		
		//to create a file in desired location
		
		File files = new File("C:\\Users\\kbala\\Testing.txt");
		try {
			if(files.createNewFile()) {
				System.out.println("File has  been created");
			}else {
				System.out.println("File exists");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
//		
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Hi Everyone ");
			bw.newLine(); // escape character \r \n
			bw.append("This is a sample file");
			System.out.println("File has written");
			bw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println(file.exists());
		System.out.println(folder.exists());
		
		System.out.println(file.getName());
		System.out.println(folder.getName());
		
		System.out.println(file.getPath()); // returns only the folder name
		System.out.println(file.getAbsolutePath()); // returns exact path
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.canExecute());
		System.out.println(file.lastModified()); // returns value in milliseconds
		
		System.out.println(file.length());

	}

}
