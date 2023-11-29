package com.homework_18sept_assignment;

import java.util.Scanner;
//3-5=2, 2-3=1
public class TwinPrimeNo {
	void checkPrimeNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the no 2: ");
		int num2 = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0) {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("Num1 is not a prime no ");
		} else {

			// for 2nd number
			count = 0;
			for (int i = 2; i <= num2; i++) {
				if (num2 % i == 0) {
					count++;
				}
			}
			if (count != 1) {
				System.out.println("Num2 is not a prime no ");
			}else {
				if(num2-num1==2) 
					System.out.println("twin prime no ");
				else 
					System.out.println("not twin prime no ");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		TwinPrimeNo t1 = new TwinPrimeNo();
		t1.checkPrimeNo();
	}
}
