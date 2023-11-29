package com.exception.assignment;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a = 5, b = 0, num;
			num = a / b;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("in ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("in ArithmeticException");
		}
	}

}
