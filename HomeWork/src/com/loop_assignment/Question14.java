package com.loop_assignment;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base =sc.nextInt();
		System.out.println("Enter the index: ");
		int index = sc.nextInt();
		int power = 1;
		for(int i=1;i<=index;i++) {
			power = power * base; //2^3=8 2=base 3 = index 8=power
		}
		System.out.println("Result is: "+power);
	}

}
