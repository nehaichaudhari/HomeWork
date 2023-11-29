package com.loop_assignment;

import java.util.Scanner;

public class Question15 {
	static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numner: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + factorial(i);
		}
		System.out.println(sum);
	}//s=1!+2!+3!+4!=1+2+6+24=33
}
