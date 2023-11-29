package com.loopassignment;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int n = sc.nextInt();
		int product=1,rem=0;
		while(n!=0) {
			rem =n%10;//reminder
			product = product * rem;
			n/=10;
		}
		System.out.println("Product is: "+product);
	}

}
