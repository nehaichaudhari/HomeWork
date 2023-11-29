package com.overriding_assignment;

public class BigKid extends Kid{
	void readBook() {
		System.out.println("In class big kid method 1");
	}
	public static void main(String[] args) {
		Kid k1 = new Kid();
		k1.readBook();
		k1.readBook("radha", 25);
		
		BigKid b1 = new BigKid();
		b1.readBook();
	}
}
