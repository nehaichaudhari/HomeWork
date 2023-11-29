package com.loop_extracode_assignment;
//0,1,2,5,12 = b*2+a;
//a b s      = 1*2+0=2
//  a b s
public class PellNumberSeries {
	public static void main(String[] args) {
		int a = 0;
		System.out.print(a);
		int b = 1;
		System.out.print(","+b);
		for(int i = 2;i<=8;i++) {
			int sum = (b*2)+a;
			a=b;
			b=sum;
			System.out.print(","+sum);
		}
	}

}
