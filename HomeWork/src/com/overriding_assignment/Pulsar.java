package com.overriding_assignment;

public class Pulsar extends Bike{
	void bikeInfo() {
		System.out.println("colour is red");
		System.out.println("speed is 200");
	}
	public static void main(String[] args) {
		Bike b1  = new Bike("balck",100);
		b1.bikeInfo();
		
		Pulsar p1 = new Pulsar();
		p1.bikeInfo();
	}

}
