package com.overriding_assignment;

public class Teenager extends Kid{
	protected void readBook() {
		System.out.println("in teenager class");
	}
	public static void main(String[] args) {
		Kid k1 = new Kid();
		Kid k2 = new Kid();
		k1 = new BigKid();
		k1.readBook();
		k2 = new Teenager();
		k2.readBook();
	}

}
