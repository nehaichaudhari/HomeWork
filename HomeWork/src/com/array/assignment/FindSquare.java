package com.array.assignment;

public class FindSquare {
	static void findSqrt(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			temp = (int) Math.sqrt(ar[i]);
			if ((temp * temp) == ar[i] && ar[i]!=0 ) {
				System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0,1 };
		findSqrt(arr);
	}

}
