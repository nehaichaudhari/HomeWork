package com.foreach.assignment;
//9. WAP to print only odd numbers within an array of integers
public class Question9 {
	static void findOddNo(int arr[]) {
		for(int i: arr) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {12,89,57,38,16,74,37};
		findOddNo(arr);
	}
}
