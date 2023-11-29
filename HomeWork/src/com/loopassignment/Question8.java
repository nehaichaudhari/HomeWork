package com.loopassignment;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int n = sc.nextInt();
		int count = 0;
		while(n!=0) {
			n/=10;//reminder
			count++;
		}
		System.out.println("Count is: "+count);
	}

}
