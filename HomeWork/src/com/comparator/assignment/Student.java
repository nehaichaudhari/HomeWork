package com.comparator.assignment;

import java.util.Objects;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	
	Student(){
		
	}

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo,name,age);
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj!=null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		Student stud = (Student)obj;
		return rollNo==stud.rollNo && Objects.equals(name, stud.name) && age==stud.age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}
