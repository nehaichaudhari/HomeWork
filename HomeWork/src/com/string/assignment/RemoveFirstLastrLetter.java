package com.string.assignment;

public class RemoveFirstLastrLetter {
	static void checkfirAndLast(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(1, str.length() - 1));
			break;
		}
	}

	public static void main(String[] args) {
		String s1 = "hello world";
		checkfirAndLast(s1);
	}

}
