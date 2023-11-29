package com.string.assignment;

public class RemoveLeadingAndTrailingSpaces {
static void trimLeadingTrailingSpace(String s1) {
//		System.out.println(s1.trim());
		int startIndex = 0;
		int endIndex = 0;
		String str = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				continue;
			} else {
				startIndex = i;
				break;
			}
		}
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == ' ') {
				continue;
			} else {
				endIndex = i;
				break;
			}
		}
		str = s1.substring(startIndex, endIndex);
		System.out.println("str : " + str);
	}

	public static void main(String[] args) {
		String s1 = "    Neha Chaudhari   ";
		System.out.println("s1 :" + s1);
		trimLeadingTrailingSpace(s1);
	}

}
