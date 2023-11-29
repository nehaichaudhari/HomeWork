package com.loop_assignment;
//121 = 121 212==212
public class Question18 {
	public static void main(String[] args) {
		int num = 121;
		int originalNo =num;
		int rem =0, rev=0;
		while(num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		if(originalNo==rev) {
			System.out.println("no is palindrom");
		}else {
			System.out.println("no is not palindrom");
		}
	}

}
