package com.oopsassignment;

public class Student {
	int studId;
	String sname;
	int marks;
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studId = 1;
		stud.sname = "radha";
		stud.marks = 80;
		
		Student stud1 = new Student();
		stud1.studId = 2;
		stud1.sname = "rani";
		stud1.marks = 75;
		
		/*Student s1 = new Student();
		Student s2 = s1;
		System.out.println(s1);
		System.out.println(s2);//pointing to the same memory location
*/		
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);
		System.out.println(s2);// in this case memory address is different
		
	}

}
