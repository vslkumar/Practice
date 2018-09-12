package com.interviewpractice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, 46000, "Vishal");
		
		String filename ="file.ser";
		
		try {
			FileOutputStream file =new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			out.writeObject(emp);
			out.close();
			file.close();
			System.out.println("Object Serialized");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
