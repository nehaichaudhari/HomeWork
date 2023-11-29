package com.abstract_assignment;

abstract class Student {
	private int id;
	private String name;
	private int fees;
	static String instituteName;
	static float discount;

	static {
		instituteName = "ThinkQuotient";
	}

	Student() {

	}

	Student(int id, String name, int fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		Student.instituteName = instituteName;
	}

	abstract void description(); // it will error- abstract method is gives only in abstract class

	static float giveDiscount(int disc) {
		discount = disc;
		return discount;
	}

	void display() {
		System.out.println("Institute name: " + instituteName);
		System.out.println("Discount is: " + discount +"%");
		System.out.println("-------");
		System.out.println("student id is: " + id);
		System.out.println("student name is: " + name);
		System.out.println("student fees is: " + fees);
		System.out.println("fees after discount is: " +(fees-((discount/100)*fees)));
	}
}

class DanceStudent extends Student {
	private String danceForm;

	DanceStudent() {

	}

	DanceStudent(int id, String name, int fees, String danceForm) {
		super(id, name, fees);
		this.danceForm = danceForm;
	}

	@Override
	void description() {
		System.out.println("there are various dance forms");
		System.out.println("dance form is: " + danceForm);
		System.out.println("-------");
	}
}

class MusicStudent extends Student {
	private String musicType;

	MusicStudent() {

	}

	MusicStudent(int id, String name, int fees, String musicType) {
		super(id, name, fees);
		this.musicType = musicType;
	}

	@Override
	void description() {
		System.out.println("there are various types of music");
		System.out.println("music type is: " + musicType);
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student.giveDiscount(20);
		
		DanceStudent d1 = new DanceStudent(1, "john", 25000, "salsa");
		d1.display();
		d1.description();
		
		MusicStudent m1 = new MusicStudent(2, "radha", 15000, "classical");
		m1.display();
		m1.description();
	}

}
