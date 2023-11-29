package com.array.assignment;

import java.util.Arrays;

public class ReplaceZeroWithOne {
	static void replace(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				ar[i]=1;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		System.out.println("before: "+Arrays.toString(arr));
		replace(arr);
		System.out.println("after: "+Arrays.toString(arr));
	}

}
