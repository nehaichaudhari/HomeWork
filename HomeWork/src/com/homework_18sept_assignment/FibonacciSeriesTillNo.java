package com.homework_18sept_assignment;

//0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 ,....500
//no1 no2 no
//    no1 no2 no
public class FibonacciSeriesTillNo {
	void checkFibonacciNo(int num) {
		int no1 = 0;
		int no2 = 1;
		int no = 0;
		System.out.print(no1 + ", " + no2);
		while (no < num) {
			no = no1 + no2;
			no1 = no2;
			no2 = no;
			if (no % 5 != 0) {
				System.out.print(", " + no);
			}
		}
	}

	public static void main(String[] args) {
		FibonacciSeriesTillNo series = new FibonacciSeriesTillNo();
		series.checkFibonacciNo(500);
	}
}
