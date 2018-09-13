package com.practice.immutable;

public class ImmutableExample {

	public static void main(String[] args) {
		
		Student s= new Student(1,"Vishal Kumar");
	    System.out.println(s.getRollNumber());
	    System.out.println(s.getName());
	    
	    //s.name="Vishal";
		
	}

}
