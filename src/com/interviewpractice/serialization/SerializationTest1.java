package com.interviewpractice.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.interviewpractice.serialization.Employee;

public class SerializationTest1 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Employee employee= null;
		try {
			FileInputStream file1 =new FileInputStream("file.ser");
			ObjectInputStream in= new ObjectInputStream(file1);
			employee = (Employee) in.readObject();
			in.close();
			file1.close();
			System.out.println("Object DeSerialized");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Employee Id :"+employee.employeeId);
		System.out.println("Employee Name:"+employee.name);
		System.out.println("Employee Salary :"+employee.salary);

	}

}
