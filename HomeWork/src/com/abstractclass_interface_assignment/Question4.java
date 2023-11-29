package com.abstractclass_interface_assignment;

class Locker{
	private int money;
	private String jewellery;
	private int pinCode;
	
	void show() {
		System.out.println("in show method");
	}
}
public class Question4 {
	public static void main(String[] args) {
		Locker locker = new Locker();
		//System.out.println(locker.money);// it is not possible to access private members
		locker.show();
	}

}
