package com.homework_18sept_assignment;

public class Series {
	public static void main(String[] args) {
//		2 12 36 80 150 252....upto 10 terms = 2*2*3, 3*3*4, 4*4*5…………
		int a = 1;
		int b = 2;
		int res = 0;
		for (int i = 0; i < 10; i++) {
			res = a * a * b;
			System.out.print(res + " ");
			a++;
			b++;
		}
	}
}
