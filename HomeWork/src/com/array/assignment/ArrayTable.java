package com.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTable {
	static void printTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int no = sc.nextInt();
		int ar[] = new int[10];
		for (int i = 1; i <= 10; i++) {
			ar[i - 1] = no * i;
		}
		System.out.println(Arrays.toString(ar));
		sc.close();
	}

	public static void main(String[] args) {
		printTable();
	}

}
