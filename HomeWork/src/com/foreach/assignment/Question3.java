package com.foreach.assignment;

//Write a Java program to find the common elements between two arrays (int values) Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] 
//and arr2[] = [39, 25, 15, 23, 55, 91, 66, 22], so common between two arrays are 23 and 91
public class Question3 {
	static void checkCommEle(int ar1[], int ar2[]) {
		for (int i : ar1) {
			for (int j : ar2) {
				if (i == j) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { -12, -23, 34, 67, 78, 91, 56 };
		int arr2[] = { 39, 25, 15, -23, 55, 91, 66, 22 };
		checkCommEle(arr1, arr2);
	}

}
