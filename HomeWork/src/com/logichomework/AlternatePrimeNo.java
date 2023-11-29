package com.logichomework;

public class AlternatePrimeNo {
	static void checkPrimeNo(int num) {
		int count;
		int result = 1;
		//boolean flag = true;
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {//2,3,5,7,11
				result++;//2,3,4,5...
				if (result % 2 == 0) {
					System.out.println(i + " ");
				}
				/*
				 * if (flag == true) { 
				 * System.out.println(i + " "); 
				 * flag = false; 
				 * } 
				 * else { 
				 * flag = true; 
				 }*/
			}
		}
	}

	public static void main(String[] args) {
		checkPrimeNo(50);
	}
}
