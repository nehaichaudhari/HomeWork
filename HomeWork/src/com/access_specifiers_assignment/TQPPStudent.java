package com.access_specifiers_assignment;

public class TQPPStudent extends Student {
	void checkStudentVariableAccess() {
		// rollNo = 10; it is not possible to access private member
		admissionNo = 111;
		age = 25;
		courseId = 101;
	}

	public static void main(String[] args) {
		TQPPStudent tq = new TQPPStudent();
		tq.checkStudentVariableAccess();
		System.out.println(tq.admissionNo);
		System.out.println(tq.age);
		System.out.println(tq.courseId);
		tq.doPublic();
		tq.doProtected();
		tq.doDefault();
		//tq.doPrivate();not possible
	}
}
