package com.array.assignment;

import java.util.Arrays;

public class ReverseArrayUsingTemp {
	static void reverse(int ar[]) {
		int temp[] = new int [ar.length];
		for(int i=0;i<temp.length;i++) {
			temp[i]=ar[i];
		}
		for(int i = temp.length-1,j=0;i>=0;i--,j++) {
			ar[j]=temp[i];
		}
	}
	public static void main(String[] args) {
		int arr[]= {3, 90, 45, 29, 37, 78};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
