package com.containment_assignment;

//Person which has attributes (name, gender, age, Address).
public class Person {
	private String name;
	private String gender;
	private int age;
	private Address address;

	Person() {

	}

	public Person(String name, String gender, int age, Address address) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nname: " + name + "\ngender: " + gender + "\nage: " + age + "\naddress details: " + address;
	}

}
