package com.array.assignment;

public class CommEleBetTwoArr {
	static void checkCommEle(int ar1[], int ar2[]) {
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j]) {
					System.out.println(ar1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		checkCommEle(arr1, arr2);
	}

}
