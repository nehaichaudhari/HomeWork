package com.foreach.assignment;

//WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]
public class Question2 {
	static void findMinValue(int arr[]) {
		int min = Integer.MAX_VALUE;
		int min1 = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		for (int i : arr) {
			if (i < min1 && i > min) {
				min1 = i;
			}
		}
		System.out.println(min1);
	}

	public static void main(String[] args) {
		int arr[] = { -20, 0, -25, 15, 19, 37, 23 };
		findMinValue(arr);
	}

}
