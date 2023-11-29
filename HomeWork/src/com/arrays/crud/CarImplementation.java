package com.arrays.crud;

import java.util.Scanner;

public class CarImplementation implements CarDetails {
	Scanner sc = new Scanner(System.in);
	Car b[] = new Car[10];
	int id, engineId;
	float price;
	String carName, engineType;
	int count = 0;

	@Override
	public void addCar() {
		System.out.println("Add Car");
		System.out.println("Enter the no of Cars you want to add");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("Enter Car id: ");
			id = sc.nextInt();
			System.out.println("Enter Car name: ");
			carName = sc.next();
			System.out.println("Enter Car price: ");
			price = sc.nextInt();
			System.out.println("Enter engine id: ");
			engineId = sc.nextInt();
			System.out.println("Enter engine type: ");
			engineType = sc.next();
			Engine engine = new Engine(engineId, engineType);
			b[count] = new Car(id, carName, price, engine);
			count++;
		}
		System.out.println("Add Car sucessufully");
	}

	@Override
	public void updateCar() {
		System.out.println("Update Car");
		System.out.println("Enter the Car name you want to update");
		String name = sc.next();
		for (int i = 0; i < count; i++) {
			if (b[i] != null && name.equals(b[i].getCarName())) {
				System.out.println("Enter Car price");
				price = sc.nextInt();
				b[i].setPrice(price);
			}
		}
		System.out.println("Update Car sucessfully");
	}

	@Override
	public void showCar() {
		for (int i = 0; i < count; i++) {
			System.out.println(b[i]);
		}

	}

	@Override
	public void deleteCar() {
		System.out.println("Delete Car");
		System.out.println("Enter the Car id you want to delete");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == b[i].getCarId()) {
				b[i] = null;
				count--;
				System.out.println("Delete Car sucessfully");
			}
		}
	}

	@Override
	public void searchCar() {
		System.out.println("Serach Car");
		System.out.println("Enter the Car name you want to search");
		String name = sc.next();
		int flag = 0;
		int i;
		for (i = 0; i < count; i++) {
			if (b[i] != null && name.equals(b[i].getCarName())) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Given Car available");
			System.out.println(b[i]);
		} else {
			System.out.println("Given Car is not available");
		}
	}

}
