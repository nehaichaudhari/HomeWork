package com.loop_extracode_assignment;

import java.util.Scanner;

//6= 6*6 =36 5*5=25 76*76=5776
public class AutomorphicNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num = sc.nextInt();
		System.out.println(num);
		int sum = 0;
		sum = num * num;
		boolean flag = false;
		while (num != 0 && sum != 0) {//0 3
			if (num % 10 == sum % 10) {//6 6
				flag = true;
			}
			else {
				flag = false;
			}
			num/=10;//0
			sum/=10;//3
		}
		if(flag==true)
			System.out.println("no is automorphic");
		else
			System.out.println("no is not automorphic");
	}
}
