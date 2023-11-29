package com.logichomework;

//   *
//  **
// ***
//****
public class RightStarPattern {
	public static void main(String[] args) {
		int num = 6;
		for (int i = 1; i < num; i++) {
			//space
			for (int j = 2 * (num - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
