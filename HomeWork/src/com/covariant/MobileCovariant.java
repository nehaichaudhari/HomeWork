package com.covariant;
class Mobile{
	String name="Radha";
	Mobile display() {
		System.out.println("name is: "+name);
		return new Mobile();
	}
}
class Samsung extends Mobile{
	Samsung display() {
		super.display();
		return new Samsung();
	}
}
public class MobileCovariant {
	public static void main(String[] args) {
		Mobile m1 = new Samsung();
		m1.display();
	}
}
