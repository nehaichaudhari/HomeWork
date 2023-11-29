package com.array.assignment;

import java.util.Arrays;

public class ReverseArrayWithoutUsingTemp {
	static void reverse(int ar[]) {
		int temp=0;
		for(int i = 0,j=ar.length-1;i<(ar.length-1)/2;i++,j--) {
			temp = ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {3, 90, 45, 29, 37, 78, 9};
		System.out.println("before: "+Arrays.toString(arr));
		reverse(arr);
		System.out.println("after: "+Arrays.toString(arr));
	}

}
