package com.containment_assignment;

public class AddressPersonMain {
	public static void main(String[] args) {
		// using constructor
		Address a1 = new Address("pune", "maharashtra", "india");
		Person p1 = new Person("john", "male", 25, a1);
		System.out.println(p1);

		// using getter setter
		Person p2 = new Person();
		p2.setName("ram");
		p2.setGender("male");
		p2.setAge(15);
		p2.setAddress(new Address());
		p2.getAddress().setCity("mumbai");
		p2.getAddress().setState("maharashtra");
		p2.getAddress().setCountry("india");
		System.out.println(p2);
	}

}
