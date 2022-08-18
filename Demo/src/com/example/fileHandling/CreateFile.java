package com.example.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File newFile = new File("C:\\Users\\ErnestZottor\\Desktop\\Spring\\File.txt");
//			if(newFile.createNewFile()) {
//				System.out.println("File created: "+ newFile.getName());
//			}
//			else {
//				System.out.println("File already exists: "+ newFile.getName());
			
			if(newFile.exists()) {
				writeToFile(newFile);
				System.out.println("File name: "+ newFile.getName());
				System.out.println("Writable: "+ newFile.canWrite());
				System.out.println("Readable: "+ newFile.canRead());
				System.out.println("File size in bytes: "+ newFile.length());
				System.out.println(newFile.getAbsolutePath());
			}
			
//			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	private static void writeToFile(File file) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.append("Java is a prominent programming language of the millenium ");
//			writer.write("Java is a prominent programming language of the millenium ");
			writer.close();
			System.out.println("Successfully wrote to file");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	private static void readFile(File file) {
		try {
			Scanner reader = new Scanner(file);
			if(reader.hasNext()) {
				String data = reader.nextLine();
				System.out.println(data);}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
