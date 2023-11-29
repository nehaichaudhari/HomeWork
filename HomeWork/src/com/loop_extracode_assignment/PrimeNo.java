package com.loop_extracode_assignment;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int count;
		System.out.println("Enter value:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are ");
		for (int j = 2; j <= n; j++) {
			count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(j + "  ");
		}

	}
}
