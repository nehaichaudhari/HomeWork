package com.homework_18sept_assignment;

public class TechNumber {
	public static void main(String[] args) {
		checkTeckNumber(2025);// 100
	}

	public static void checkTeckNumber(int num) {
		int count = 0;
		int original = num;
		while (num != 0) {
			num = num / 10;//2025
			count++;//4
		}	
		if (count % 2 == 0) {//2025
			int place = 1;
			for (int i = 1; i <= count / 2; i++) {//count = 1,2
				place = place * 10;//1*10=10   10*10=100
			}

			int no1 = original / place;// if no is fixed with 4 digit then directly divide by 100//3025/100=30
			int no2 = original % place;// 3025%100=25
			int sum = no1 + no2;
			int square = sum * sum;
			if (square == original) {
				System.out.println(original + " is tech number.");
			} else {
				System.out.println(original + " is not tech number.");
			}
		} else {
			System.out.println(original + " is not tech number.");
		}
	}

}
