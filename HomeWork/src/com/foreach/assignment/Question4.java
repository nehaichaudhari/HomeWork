package com.foreach.assignment;

///WAP to calculate average of all elements in an Array except
public class Question4 {
	static void findAvg(int arr[]) {
		int avg = 0, sum=0;
		for (int i : arr) {
			sum+=i;
		}
		avg = sum/arr.length;
		System.out.println("average is: " + avg);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 9, 36, 45, 89 };
		findAvg(arr);
	}
}
