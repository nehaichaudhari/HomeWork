package com.overriding_assignment;

public class EBay extends Company {
	void address() {
		System.out.println("In EBay class");
	}

	public static void main(String[] args) {
		Company c1 = new Company();
		c1.address();
		
		EBay e1 = new EBay();
		e1.address();
	}
}
