package com.overriding_assignment;

public class Car extends Vehicle {
	void accelerate(long mph) {
		System.out.println(run());
		System.out.println("accelerate " + mph);
		System.out.println(stop());
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.accelerate(200);
	}

}
