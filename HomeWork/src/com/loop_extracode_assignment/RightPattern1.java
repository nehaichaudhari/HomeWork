package com.loop_extracode_assignment;

public class RightPattern1 {
	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i <= num; i++) {// row
			// numbers
			for (int j = i; j <= 2 * i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i =num-1; i>=1; i--) {// row
			// numbers
			for (int j = i; j <= 2 * i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
