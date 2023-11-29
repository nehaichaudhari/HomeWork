package com.foreach.assignment;
//8. WAP to print the alternate elements of an array of integers
public class Question8 {
	static void printAlternateNo(int arr[]) {
		int index = 0;
		for(int i:arr) {
			if(index%2!=0)
				System.out.println(i);
			index++;
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,-3,4,8,6,7,9,9};
		printAlternateNo(arr);
	}
}
