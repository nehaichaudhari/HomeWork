package com.set.assignment;

public class Student {
	private int sid;
	private String sname;
	private int marks;
	private int feesPaid;
	private Course course;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int marks, int feesPaid, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.feesPaid = feesPaid;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", fees paid=" + feesPaid + ", course="
				+ course + "]";
	}

}
