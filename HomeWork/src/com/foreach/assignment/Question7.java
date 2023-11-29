package com.foreach.assignment;

//7. WAP to display only the square numbers in array. 
//Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.
public class Question7 {
	static void displaySquare(int arr[]) {
		int square = 0;
		for (int i : arr) {
			square = (int) Math.sqrt(i);
			if (square * square == i && i!=0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };
		displaySquare(arr);
	}
}
