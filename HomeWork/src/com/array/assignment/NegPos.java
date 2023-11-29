package com.array.assignment;

import java.util.Arrays;

public class NegPos {
	static void negAndPos(int ar[]) {
		int pos = 0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]<= 0) {
				temp = ar[i];
				ar[i] = ar[pos];
				ar[pos] = temp;
				pos++;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = {2, -1, -4, 6, -7, 8, 10,-1};
		negAndPos(arr);
	}

}
