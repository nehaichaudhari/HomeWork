package com.overriding_assignment;

public class Bike {
	private String colour;
	private int speed;
	
	Bike(){
		
	}
	
	Bike(String colour, int speed){
		this.colour=colour;
		this.speed=speed;
	}
	
	void bikeInfo() {
		System.out.println("colour is: "+colour);
		System.out.println("speed is: "+speed);
	}

}
