package com.loop_extracode_assignment;

//98564289
public class SumTillSingleNo {
	static int reduceNum(int num) {
		int sum = 0;
		while (num > 0 || sum > 9) {
			if (num == 0) {
				num = sum;
				sum = 0;
			}
			sum += num % 10;// 6+9+7+8=30
			num /= 10;// 9856428
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int num = 8796;
		reduceNum(num);
	}
}