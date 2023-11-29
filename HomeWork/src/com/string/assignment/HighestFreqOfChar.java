package com.string.assignment;

public class HighestFreqOfChar {
	static void highestFrequencyChar(String s1) {
		int[] freq = new int[s1.length()];
		char maxChar = s1.charAt(0);
		int max;

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
		max = freq[0];
		for (int i = 0; i < freq.length; i++) {
			if (max < freq[i]) {
				max = freq[i];
				maxChar = chars[i];
			}
		}
		System.out.println("Highest frequencey char : " + maxChar);
	}
	public static void main(String[] args) {
		String s1 = "hello world";
		System.out.println(s1);
		highestFrequencyChar(s1);
	}

}
