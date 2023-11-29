package com.loopassignment;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int n = sc.nextInt();
		System.out.println("Enter the digit: ");
		int d = sc.nextInt();
		int count = 0,rem = 0;
		while(n!=0) {
			rem = n%10;//reminder 1231 == 1 ==3 ==2 ==1
			if(rem==d) {
				count++;//1 ==2
			}
			n/=10;//123 ==12 ==1
		}
		System.out.println("Count is: "+count);
		sc.close();
	}

}
