package com.string.assignment;

public class CountOccOfWord {
	static void countOccOfWord(String str, String word) {
		String strarr[] = str.split("\\s");
		int count = 0;
		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i].equals(word)) {
				count++;
			}
		}
		System.out.println(word + " ===> " + count);
	}

	public static void main(String[] args) {
		String s1 = "india is a beautiful country, india is best";
		countOccOfWord(s1, "a");
	}

}
