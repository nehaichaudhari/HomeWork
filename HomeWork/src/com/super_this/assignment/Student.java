package com.super_this.assignment;

class Student1{
	private int id;
	private String name;
	
	//setter getter
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;// if will not give this keyword then it will get confused which variable need to call
	}
}
public class Student {
	public static void main(String[] args) {
		Student1 s1= new Student1();
		//this.id;// this is not allow in main method
		s1.setId(11);
		System.out.println(s1.getId());
		Student1 s2= new Student1();
		s2.setId(21);
		System.out.println(s2.getId());
	}

}
