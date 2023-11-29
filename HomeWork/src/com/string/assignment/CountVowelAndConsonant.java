package com.string.assignment;

public class CountVowelAndConsonant {
	static void vowelConsonantsCount(String s1) {
		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowel count : " + vowelCount);
		System.out.println("Consonent count : " + consonantCount);
	}

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(s1);
		vowelConsonantsCount(s1);

	}

}
