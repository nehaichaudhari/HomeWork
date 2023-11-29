package com.loop_extracode_assignment;

public class DiamondPattern {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {//row
			
			//spaces
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			
			//numbers
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
