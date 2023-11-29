package com.string.assignment;

public class SplitString {
	static void splitString(String str) {
		String splitsarr[] = str.split("\\$");
		for (int i = 0; i < splitsarr.length; i++) {
			System.out.println(splitsarr[i]);
		}
	}

	public static void main(String[] args) {
		String s1 = "Hello$World";
		splitString(s1);
	}

}
