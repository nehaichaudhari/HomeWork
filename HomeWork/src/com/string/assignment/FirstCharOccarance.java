package com.string.assignment;

public class FirstCharOccarance {
	static void checkOccurance(String str) {
		char first = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == first) {
				count++;
			}
		}
		System.out.println(first + " ===> " + count);
	}

	public static void main(String[] args) {
		String s1 = "india is a beautiful country";
		checkOccurance(s1);
	}

}
