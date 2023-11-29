package com.foreach.assignment;
//WAP to print minimum in each row. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 9 and 12.
public class Question5 {
	static void minInEachRow(int arr[][]) {
		for(int[]i: arr) {
			int minVal = Integer.MAX_VALUE;
			for(int j:i) {
				if(j<minVal) {
					minVal = j;
				}
			}
			System.out.println(minVal);
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{22, 31, 9}, {12, 25, 16}};
		minInEachRow(arr);
	}
}
