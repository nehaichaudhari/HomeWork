package com.foreach.assignment;
//10. WAP to print the elements within a 3D array
public class Question10 {
	public static void main(String[] args) {
		int[][][] arr = {{{1,2},{3,4},{5,6}},{{7,8},{9,1},{2,3}}};
		int[][][] arr1 = {{{1,2},{3,4},{5,6}},{{7,8},{9,1},{2,3}}};
		for(int[][] i:arr1) {
			for(int j[]:i) {
				for(int k:j) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
