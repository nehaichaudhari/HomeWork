package com.foreach.assignment;
///WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class Question1 {
	static void findMaxVal(int arr[]) {
		int max = Integer.MIN_VALUE;
		int max1 = Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>max) {
				max= i;
			}
		}
		for(int i:arr) {
			if(i>max1 && i<max) {
				max1=i;
			}
		}
		System.out.println(max1);
	}
	public static void main(String[] args) {
		int arr[] = {20, 0, 31, 45, 100, 1, 105, 90};
		findMaxVal(arr);
	}
}
