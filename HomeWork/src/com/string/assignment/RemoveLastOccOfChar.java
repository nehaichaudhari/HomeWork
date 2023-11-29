package com.string.assignment;

public class RemoveLastOccOfChar {
	static void removeLastOccurance(String s1, char ch) {
		String str = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == ch) {
				str = s1.substring(0, i) + s1.substring(i + 1);
				break;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String s1 = "Hello world";
		System.out.println(s1);
		removeLastOccurance(s1, 'l');
	}

}
