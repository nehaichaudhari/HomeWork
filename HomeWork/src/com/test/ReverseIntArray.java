package com.test;

import java.util.Arrays;

public class ReverseIntArray {
	static void checkReverse(int arr[]) {
		int mid = arr.length/2;
		if(arr.length%2!=0) 
			mid++;
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i]=arr[mid];
			arr[mid]=temp;
			mid++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		//int arr[]= {5,22,55,21,4,54,10};
		int arr[]= {1,2,5,7,3,4};
		checkReverse(arr);
	}

}
