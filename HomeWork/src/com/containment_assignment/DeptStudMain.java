package com.containment_assignment;

public class DeptStudMain {
	public static void main(String[] args) {
		Department d1 = new Department(1,"IT");
		Department d2 = new Department(2,"HR");
		
		Student s1 = new Student(101,"ram",d1);
		Student s2 = new Student(102,"shyam",d2);
		Student s3 = new Student(103,"radha",d2);
		Student s4 = new Student(104,"seeta",d1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
