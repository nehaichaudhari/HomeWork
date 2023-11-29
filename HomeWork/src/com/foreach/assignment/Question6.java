package com.foreach.assignment;

///WAP to print maximum in each column. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} 
//output is: 34, 42, and 16.
public class Question6 {
	static void maxInEachColumn(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { 
				{ 22, 31, 9 }, 
				{ 12, 5, 16 }, 
				{ 34, 42, 2 } 
			};
		maxInEachColumn(arr);	
	}
}
