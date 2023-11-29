package com.string.assignment;

public class ToggleCase {
	static void toggleCase(String s1) {
		String str = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 62 && ch <= 90) {
				ch += 32;
			} else if (ch >= 97 && ch <= 122) {
				ch -= 32;
			}
			str += ch;
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(s1);
		toggleCase(s1);
	}

}
