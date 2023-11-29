package com.oopsassignment;

public class StudentMain {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studId = 101;
		stud.sname= "john";
		stud.marks =50;
		
		Student stud1= new Student();
		stud1.studId = 102;
		stud1.sname = "arati";
		stud1.marks = 95;
		
		System.out.println("Student 1 detais are: "+stud);
		System.out.println("Student 2 detais are: "+stud1);
	}

}
