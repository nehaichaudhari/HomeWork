package com.array.assignment;

public class Equality {
	static void checkEquality(int ar1[], int ar2[]) {
		boolean result = false;
		for(int i=0;i<ar1.length;i++) {
			result = false;
			for(int j=0;j<ar2.length;j++) {
				if(ar1[i]==ar2[j]) {
					result = true;
					break;
				}
			}
			if(result==false) {
				break;
			}
		}
		if(result==true) {
			System.out.println("both arrays are equal");
		}else
			System.out.println("both arrays are not equal");
	}

	public static void main(String[] args) {
		int arr1[] = { 12, 22, 32, 42, 52, 62 };
		int arr2[] = { 52, 22, 62, 12, 42, 32 };
		checkEquality(arr1, arr2);
	}

}
