package com.string.assignment;

public class CovertLowToUpper {
	static void conLowToUpper(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) {
				ch[i] -= 32;
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String s1 = "javaz";
		conLowToUpper(s1);
	}

}
