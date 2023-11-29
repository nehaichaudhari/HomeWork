package com.string.assignment;

public class CountFreqOfEachChar {
	static void frequencyCount(String s1) {
		int[] freq = new int[s1.length()];
		char chars[] = s1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j] && chars[i] != ' ' && chars[i] != '\0') {
					freq[i]++;
					chars[j] = '\0';
				}
			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (chars[i] != '\0' && chars[i]!=' ')
				System.out.println(chars[i] + " : " + freq[i]);
		}
	}
	public static void main(String[] args) {
		String s1 = "hello world";
		System.out.println(s1);
		frequencyCount(s1);
	}
}
