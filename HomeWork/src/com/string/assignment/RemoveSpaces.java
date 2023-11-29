package com.string.assignment;

public class RemoveSpaces {
	static void removeTrailingSpaces(String s1) {
		String str = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == ' ') {
				continue;
			} else {
				str = s1.substring(0, i + 1);
				break;
			}
		}
		System.out.println("str : " + str);
	}

	public static void main(String[] args) {
		String s1 = "Neha Chaudhari     ";
		System.out.println("s1 : " + s1);
		removeTrailingSpaces(s1);

	}

}
