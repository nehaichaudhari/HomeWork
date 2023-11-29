package com.loop_extracode_assignment;

import java.util.Scanner;

//78654329 = 92345687
//op= 3 5 7
public class ReversePrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		while (num != 0) {
			int rem = num % 10;// 9
			num /= 10;// 7865432
			int count = 0;
			for (int i=2; i<=rem; i++) {// 2 //3
				if (rem % i == 0) {// 9%2==0 nahiye //9%3==0 yes
					count++;// y=2
				}
			}
			if (count == 1) {
				System.out.print(rem+" ");
			}
		}
	}

}
