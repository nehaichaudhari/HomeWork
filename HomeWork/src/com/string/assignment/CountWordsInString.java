package com.string.assignment;

public class CountWordsInString {
	static void countWords(String str) {
		String splitsarr[] = str.split("\\s");
		System.out.println("count of words is: "+splitsarr.length);
	}

	public static void main(String[] args) {
		String s1 = "india is a beautiful country";
		countWords(s1);
	}

}
