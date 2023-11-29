package com.static_final_assignment;

public class Program7 {

}

class RacingCar extends Car {
	public static void main(String[] args) {
		System.out.println("totalCarSold :" + totalCarSold); //7. we can access the inherited static variables using protected
		method1(); //8. we can access the inherited static methods
	}
}