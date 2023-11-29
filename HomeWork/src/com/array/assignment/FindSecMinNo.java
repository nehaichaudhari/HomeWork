package com.array.assignment;

import java.util.Arrays;

public class FindSecMinNo {
	static void findNo(int ar[]) {
		for(int i = 0;i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {20, 0, 25, 15, 19, 37, 23};
		findNo(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
	}
}
