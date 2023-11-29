package com.string.assignment;

import java.util.Scanner;

public class PrintDupliCharAndCount {
	static void checkDuplicateChar(String str) {
		char ch[] = str.toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\0')
				continue;
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			if (count >= 2) {
				System.out.println(ch[i] + " ====> " + count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s1 = sc.next();
		checkDuplicateChar(s1);
	}

}
