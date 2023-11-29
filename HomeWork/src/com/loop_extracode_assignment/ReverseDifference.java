package com.loop_extracode_assignment;

import java.util.Scanner;

public class ReverseDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int diff = 0;
		int originalNo = num;
		int rev = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		diff = originalNo - rev;
		if (diff < 0) {
			System.out.println(0);
		} else {
			System.out.println("Output is: "+diff);
		}
	}
}
