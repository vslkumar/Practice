package com.interviewpractice.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID= 12345678L;
	
	int employeeId;
    int salary;
	String name;
	
  
	public Employee(int employeeId , int salary, String name) {
		super();
		this.employeeId=employeeId;
		this.salary=salary;
		this.name=name;	
	}

	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
