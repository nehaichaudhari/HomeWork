package com.overloading_assignment;

import java.util.Scanner;

class VolumneCalculator {

	double calculateVolume(double radius, double height) {
		return 3.14 * radius * radius * height;
	}

	double calculateVolume(int length, int breadth, int height) {
		return length * breadth * height;
	}
}

public class TestMain {
	public static void main(String[] args) {
		VolumneCalculator calculator = new VolumneCalculator();
		System.out.println("Enter the choice : ");
		System.out.println("1.Find Volume For Cylinder");
		System.out.println("2.Find Volume For Cuboid");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the radius : ");
			double radius = sc.nextDouble();
			System.out.println("Enter the height : ");
			double height = sc.nextDouble();
			double output = calculator.calculateVolume(radius, height);
			System.out.println("Volume of the Cylinder is : " + output);
		} else if (choice == 2) {
			System.out.println("Enter the length : ");
			int length = sc.nextInt();
			System.out.println("Enter the breadth : ");
			int breadth = sc.nextInt();
			System.out.println("Enter the height : ");
			int height = sc.nextInt();
			double output = calculator.calculateVolume(length, breadth, height);
			System.out.println("Volume of the Cuboid is : " + output);
		}
		sc.close();
	}
}
