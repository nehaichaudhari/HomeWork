package com.array.assignment;

import java.util.Scanner;

public class MissingNo {
	static void checkMissingNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int num = sc.nextInt();
		System.out.println("Enter the array element: ");
		int ar[]= new int[num];
		for(int i=0;i<num;i++) {
			ar[i]=sc.nextInt();
		}
		for (int i=0, j=1;i<num;i++, j++) {
			if (ar[i] != j) {
				System.out.println("Missing no is: "+j);
				break;
			}
		}
	}
	public static void main(String[] args) {
		checkMissingNo();
	}

}
