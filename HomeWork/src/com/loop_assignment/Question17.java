package com.loop_assignment;

public class Question17 {
	public static void main(String[] args) {
		int num = 175;
		int count = 0;
		int originalNo = num;
		int num1 = num;
		int sum = 0;
		// count
		while (num != 0) {
			count++;
			num /= 10;
		}
		// for disarium no
		while (num1 != 0) {
			int rem = num1 % 10;// 5,3,1
			int pow = (int) Math.pow(rem, count);// 5^3,3^2,1^1
			sum = sum + pow;// 125+9+1=135
			count--;
			num1/=10;
		}
		if (originalNo == sum) {
			System.out.println("No is disarium");
		} else {
			System.out.println("No is not disarium");
		}
	}

}
