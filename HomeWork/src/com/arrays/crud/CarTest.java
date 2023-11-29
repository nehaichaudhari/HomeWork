package com.arrays.crud;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		CarDetails car = new CarImplementation();

		do {
			System.out.println("1. Add Car");
			System.out.println("2. Update Car");
			System.out.println("3. Show Car Information");
			System.out.println("4. Delete Car");
			System.out.println("5. Search Car by id");
			System.out.println("6. Exit");
			System.out.println("----------------------------");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				car.addCar();
				break;
			case 2:
				car.updateCar();
				break;
			case 3:
				car.showCar();
				break;
			case 4:
				car.deleteCar();
				break;
			case 5:
				car.searchCar();
				break;
			case 6:
				System.exit(0);
			}
		} while (true);
	}
}
