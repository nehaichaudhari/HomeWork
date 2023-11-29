package com.array.assignment;

import java.util.Arrays;

public class SwapArray {
	static void swapping(int ar[]) {
		for(int i=0;i<ar.length-2;i++) {//0
			if(ar[i]%2==0) {
				int temp =ar[i];
				ar[i]=ar[i+2];
				ar[i+2]=temp;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args) {
		int arr[]= {2,4,9,0};//9 0 2 4
		swapping(arr);
	}

}
