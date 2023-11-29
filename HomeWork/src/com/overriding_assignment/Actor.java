package com.overriding_assignment;

public class Actor extends Person {
	void readScript() {
		System.out.println("In actor class");
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.readScript();

		Actor a1 = new Actor();
		a1.readScript();
	}

}
