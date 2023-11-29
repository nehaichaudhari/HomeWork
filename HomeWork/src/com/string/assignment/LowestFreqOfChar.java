package com.string.assignment;

public class LowestFreqOfChar {
	static void lowestFrequencyChar(String s1) {
		int[] freq = new int[s1.length()];
		char maxChar = s1.charAt(0);
		int min;
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
		min = freq[0];
		for (int i = 0; i < freq.length; i++) {
			if (min > freq[i]) {
				min = freq[i];
				maxChar = chars[i];
			}
		}
		System.out.println("Lowest frequencey char : " + maxChar);
	}
	public static void main(String[] args) {
		String s1 = "hello world";
		System.out.println(s1);
		lowestFrequencyChar(s1);
	}

}
