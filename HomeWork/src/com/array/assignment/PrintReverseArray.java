package com.array.assignment;

public class PrintReverseArray {
	static void printReverse(int ar[]) {
		for(int i = ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+", ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {3, 90, 45, 29, 37, 78};
		printReverse(arr);
	}

}
