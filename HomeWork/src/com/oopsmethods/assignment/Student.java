package com.oopsmethods.assignment;

public class Student {
	int id;
	String name;
	
	void displyData(int id,String name) {
		this.id=id;
		this.name = name;
		System.out.println(this.id+" "+this.name);
		this.id = getId();
	}
	
	void setCustomData(int customId, String customName) {
		/*this.id = customId;
		this.name = customName;*/
	}
	
	void passByReference(Student student) {//pass by reference
		student.id = 100;
		System.out.println(student.hashCode());
	}
	
	public int getId() {
		return id;
	}
public static void main(String[] args) {
	Student stud = new Student();
	stud.displyData(101, "raju");
	stud.setCustomData(201, "Neha");
	System.out.println(stud.id+" "+stud.name);
	
	Student stud1 = new Student();//2018699554
	stud1.id=500;
	System.out.println(stud1.hashCode());
	stud.passByReference(stud1);
	System.out.println(stud1.id);
}
}
