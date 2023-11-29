package com.loop_extracode_assignment;

import java.util.Scanner;
//12345
public class IncDecBouncy {
	static boolean checkIncreasing(int num) {
		int rem1 = num % 10;//5
		num /= 10;//1234
		boolean flag = true;
		while (num > 0) {
			int rem2 = num % 10;//4=== 3===1
			if (rem1 > rem2) {//5>4 ====4>3
				rem1 = rem2;//4 ha rem1 mdhe taknar // 3set honar rem1
			} else {
				flag = false;
				break;
			}
			num /= 10;//123==12==1
		}
		return flag;
		/*
		 * if (flag == true) { System.out.println("No is in increasing order"); } else
		 * System.out.println("No is not in increasing order");
		 */
	}

	static boolean checkdecrsing(int num) {
		int rem1 = num % 10;
		num /= 10;
		boolean flag = true;
		while (num > 0) {
			int rem2 = num % 10;
			if (rem1 < rem2) {
				rem1 = rem2;
			} else {
				flag = false;
				break;
			}
			num /= 10;
		}
		return flag;
		/*
		 * if (flag == true) { System.out.println("No is in decreasing order"); } else
		 * System.out.println("No is not in decreasing order");
		 */
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean increasing = checkIncreasing(num);
		boolean decreasing = checkdecrsing(num);
		if (increasing == true) {
			System.out.println("No is in increasing order");
		} else if (decreasing == true) {
			System.out.println("No is in decreasing order");
		} else {
			System.out.println("no is bouncy");
		}
	}

}
