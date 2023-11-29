package com.abstractclass_interface_assignment;
class Wifi{
	protected void access() {
		System.out.println("wifi access ");
	}
}
class Employee1 extends Wifi{
	void print() {
		System.out.println("in print method ");
		access();
	}
}
public class Question2 {
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.print();
	}

}
