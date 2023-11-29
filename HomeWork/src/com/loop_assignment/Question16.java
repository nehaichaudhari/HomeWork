package com.loop_assignment;

import java.util.Scanner;

//153 = 1!+3!+5!=1+3*2*1+5*4*3*2*1=1+6+120=126  145=1+4*3*2+120=24+1+120=145
public class Question16 {
	static void checkKrushnaMurthy(int num) {
		int originalNo = num;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;// 145=5// 4//1
			int fact = 1;
			for (int i = 1; i <= rem; i++) {// i=1,2,3,4
				fact = fact * i;
			}
			System.out.println("factorial is: " + fact);
			sum += fact;
			num /= 10;//14//1
			System.out.println("sum is"+sum);
			System.out.println("num is"+num);
		}
		if (sum == originalNo) {
			System.out.println("No is krishnamurthy number: ");
		} else {
			System.out.println("No is not krishnamurthy number: ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		checkKrushnaMurthy(num);
	}
}
