package com.loop_assignment;

public class Question11 {
	public static void main(String[] args) {
		int num=400;
		int num1=300;
		int count;
		for(int i = 400; i>=300; i--) {
			count = 0;
			for(int j = 2; j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(i+" ");
			}
		}
	}

}
