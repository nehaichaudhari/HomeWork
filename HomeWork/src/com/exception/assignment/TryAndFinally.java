package com.exception.assignment;

public class TryAndFinally {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("in finally block");
		}

	}

}
