package com.collection_list_test;

import java.util.ArrayList;
import java.util.Arrays;

/// Input:THE SKY IS THE LIMIT.
//POTENTIAL:THE=33,SKY=55,IS=28,THE=33,LIMIT=63 
//Output :IS THE THE SKY LIMIT

public class Question10 {
	static void encryptAlpha(String str) {
		String strArr[] = str.split("\\s");
		int arr[] = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			String str1 = strArr[i];
			int count = 0;
			for (int j = 0; j < str1.length(); j++) {
				count += ((int) str1.charAt(j)) - 64;
			}
			arr[i] = count;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					String temp1 = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp1;
				}
			}
		}
		for (String s : strArr) {
			System.out.print(s+" ");
		}
	}

	public static void main(String[] args) {
		String str = "THE SKY IS THE LIMIT";
		encryptAlpha(str);
	}
}
