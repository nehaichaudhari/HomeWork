package com.string.assignment;

public class LastOccOfChar {
	static void findLastOccurance(String s1, char ch) {
//		System.out.println(s1.lastIndexOf(ch));
		int index = -1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == ch) {
				index = i;
				break;
			}
		}
		System.out.println("Index: " + index);
	}

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(s1);
		char ch = 'l';
		findLastOccurance(s1, ch);
	}

}
