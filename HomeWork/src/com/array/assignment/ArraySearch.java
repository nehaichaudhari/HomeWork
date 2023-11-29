package com.array.assignment;

import java.util.Scanner;

public class ArraySearch {
	static void search(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int no = sc.nextInt();
		int[] ar = new int[no];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < no; i++) {
			ar[i] = sc.nextInt();
		}

		boolean flag1 = false, flag2 = false;
		for (int i = 0; i < no; i++) {
			if (ar[i] == a) {
				flag1 = true;

			}
			if (ar[i] == b) {
				flag2 = true;
				System.out.println(b + " is present in array");
			}
		}
		if (flag1 == true) {
			System.out.println(a + " is present in array");
		} else {
			System.out.println(a + " is not present in array");
		}

		if (flag2 == true) {
			System.out.println(b + " is present in array");
		} else {
			System.out.println(b + " is not present in array");
		}
		sc.close();
	}

	public static void main(String[] args) {
		search(65, 77);
	}
}
