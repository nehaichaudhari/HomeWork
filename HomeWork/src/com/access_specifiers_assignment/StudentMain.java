package com.access_specifiers_assignment;

public class StudentMain {
	public static void main(String[] args) {
		Student stude = new Student();
		// stude.rollNo=101; this is not allow because it is private, private cannot
		// access outside class
		stude.admissionNo = 1;
		stude.age = 20;
		stude.courseId = 201;

		stude.doDefault();
		stude.doProtected();
		stude.doPublic();
		// stude.doPrivate(); not allow
	}
}
