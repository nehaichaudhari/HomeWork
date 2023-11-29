package com.loop_extracode_assignment;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int num =34;
		System.out.println("Number is: "+num);
		int count = 0;
		while(num!=0) {
			count++;
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the num: ");
			int num1 = sc1.nextInt();//32
			if(num>num1) {
				System.out.println("Number is less than please enter another no: ");
			}
			else if(num<num1) {
				System.out.println("Number is greater than please enter another no: ");
			}
			else {
				System.out.println("Congratulation it is exact number ");
				System.out.println("Number of attemps is: "+count);
				break;
			}
		}
	}
	

}
