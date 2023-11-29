package com.loop_assignment;

//200= 2+0+0=2 so 200 is divisible by 2 if yes then it is harshad no
public class HarshadSeries {
	static void chechkHarshadNo(int num) {
		int originalNo = num;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;// 0,0,2
			sum = sum + rem;// 0,0,2
			num /= 10;// 20,2,0
		}
		if (originalNo%sum == 0) {
			System.out.println("no is harshad number");
		} else {
			System.out.println("no is not harshad number");
		}
	}
	public static void main(String[] args) {
		int num = 165;
		chechkHarshadNo(num);
	}
}
