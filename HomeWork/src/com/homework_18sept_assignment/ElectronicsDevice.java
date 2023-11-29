package com.homework_18sept_assignment;

public class ElectronicsDevice {
	int deviceId;
	String deviceName;

	public ElectronicsDevice(int deviceId, String deviceName) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}

	void display() {
		System.out.println("\ndevice id is: " + deviceId + "\ndevice name is: " + deviceName);
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile(1, "Mobile", "Samsung", "4G");
		m1.display();
		Laptop l1 = new Laptop(2, "Laptop", 111, "i5");
		l1.display();
	}
}

class Mobile extends ElectronicsDevice {
	String moName;
	String moType;

	public Mobile(int deviceId, String deviceName, String moName, String moType) {
		super(deviceId, deviceName);
		this.moName = moName;
		this.moType = moType;
	}
	
	void display() {
		super.display();
		System.out.println("Mobile Name is: "+moName+"\nMobile type is: "+moType);
	}
}

class Laptop extends ElectronicsDevice {
	int laptopId;
	String processor;

	public Laptop(int deviceId, String deviceName, int laptopId, String processor) {
		super(deviceId, deviceName);
		this.laptopId = laptopId;
		this.processor = processor;
	}
	void display() {
		super.display();
		System.out.println("Laptop id is: " + laptopId + "\nlaptop processor is: " + processor);
	}
}