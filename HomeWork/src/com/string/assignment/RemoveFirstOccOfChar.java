package com.string.assignment;

public class RemoveFirstOccOfChar {
	static void removeFirstOccurance(String s1, char ch) {
		String str = "";
		for (int i = 0; i < s1.length(); i++) {
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
		removeFirstOccurance(s1, 'l');
	}

}
