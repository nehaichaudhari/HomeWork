package com.overriding_assignment;

public class Employee extends Programmer{
	int workingHours() {
		System.out.println("In Employee class");
		return 8;
	}
	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		p1.workingHours();
		p1 = new Employee();
		p1.workingHours();
	}

}
