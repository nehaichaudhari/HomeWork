package com.string.assignment;

public class RemoveExtraSpaces {
	static void removeExtraSpaces(String s1) {
		String str = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				if (i - 1 >= 0 && s1.charAt(i - 1) == ' ') {
					str += ' ';
				}
				str += s1.charAt(i);
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String s1 = " I am  Neha   Chaudhari";
		s1 = s1.trim();
		System.out.println(s1);
		removeExtraSpaces(s1);
	}

}
