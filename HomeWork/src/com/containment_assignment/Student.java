package com.containment_assignment;

public class Student {
	private int roll;
	private String name;
	private Department dept;
	
	Student(){
		
	}
	
	Student(int roll,String name,Department dept){
		this.roll=roll;
		this.name=name;
		this.dept=dept;
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setDept(Department dept) {
		this.dept=dept;
	}
	public Department getDept() {
		return dept;
	}
	
	public String toString() {
		return "\nStudent roll no is: "+roll+"\nstudent name is: "+name+"\ndepartment details: "+dept;
	}

}
