package com.array.assignment;

import java.util.Arrays;

public class PrintDuplicateValue {
	static void findDuplicate(int ar[]) {
		int temp[] = new int[ar.length];
		for(int i = 0;i<ar.length-1;i++) {
			for(int j =0;j<temp.length;j++) {
				if(ar[i]== temp[j]) {
					System.out.println(temp[j]);
				}
			}
			temp[i] = ar[i];
		}
	}
	public static void main(String[] args) {
		int arr[] = {3, 10, 90, 78, 56, 10, 78, 34, 61};
		System.out.println("before: "+Arrays.toString(arr));
		findDuplicate(arr);
		
	}

}
