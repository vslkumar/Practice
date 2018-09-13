package com.interviewpractice.cloneable;

public class CloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s= new Student(1, "Vishal Kumar");
		Student sCopy= (Student) s.clone();
		
		sCopy.setRollNumber(2);
		
		System.out.println("S Roll Number  :" + s.getRollNumber());
		System.out.println("S Name  :" + s.getName());
		System.out.println("SCopy Roll Number  :" + sCopy.getRollNumber());
		System.out.println("sCopy Name  :" + sCopy.getName());
	}

	
}
