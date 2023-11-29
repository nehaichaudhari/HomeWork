package com.string.assignment;

import java.util.Scanner;

public class SecondOccurance {
	static void checkLetter(String str) {
		int count = 0;
		int i;
		int index=-1;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
			if (count == 2) {
				index=i;
				break;
			}
		}
		System.out.println("index of second occurance: " + index);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		checkLetter(s1);
	}

}
