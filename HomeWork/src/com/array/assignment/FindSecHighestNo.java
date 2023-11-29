package com.array.assignment;

import java.util.Arrays;

public class FindSecHighestNo {
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
		int arr[]= {1,2,8,9,4,3,6};
		findNo(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);
		//System.out.println(arr[1]);
	}

}
