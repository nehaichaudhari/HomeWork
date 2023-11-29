package com.string.assignment;

public class CompareTwoString {
	static void comparestring(String str1, String str2) {
		char ch[] = str1.toCharArray();
		char ch1[] = str2.toCharArray();
		int diff = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ch1[i])
				continue;

			else {
				diff = ch[i] - ch1[i];
				break;
			}

		}
		System.out.println("difference is: " + diff);
	}

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "jaker";
		comparestring(s1, s2);
	}

}
