package com.string.assignment;

import java.util.Scanner;

public class Palindrome {
	static void checkPalindrome(String s1) {
		char ch[] = s1.toCharArray();
		boolean flag = true;
		for (int i = 0, j = ch.length - 1; i < ch.length; i++, j--) {
			if (ch[i] != ch[j]) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("string is palindrome");
		} else
			System.out.println("string is not palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		checkPalindrome(str);
	}

}
