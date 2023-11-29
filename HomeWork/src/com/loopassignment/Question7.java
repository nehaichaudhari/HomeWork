package com.loopassignment;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value for n: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("sum is: "+sum);
		sc.close();
	}

}
