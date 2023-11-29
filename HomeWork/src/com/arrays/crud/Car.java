package com.arrays.crud;

public class Car {
	private int carId;
	private String carName;
	private float price;
	private Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int carId, String carName, float price, Engine engine) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.price = price;
		this.engine = engine;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", price=" + price + ", engine=" + engine + "]";
	}
}
