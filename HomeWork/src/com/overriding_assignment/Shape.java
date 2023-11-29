package com.overriding_assignment;

public class Shape {
	void draw() {
		System.out.println("draw method in Shape class");
	}

	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.draw();
		s1 = new Circle();
		s1.draw();
		s1 = new Square();
		s1.draw();
		s1 = new Rectangle();
		s1.draw();
	}

}

class Circle extends Shape {
	void draw() {
		System.out.println("draw method in Circle class");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("draw method in Square class");
	}

}

class Rectangle extends Shape {
	void draw() {
		System.out.println("draw method in Rectangle class");
	}

}
