package com.string.assignment;

public class ConvertStrUpperCaseToLower {
	static void convertUpperToLower(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				str2 += (char) (str.charAt(i) + 32);
			} else {
				str2 += str.charAt(i);
			}
		}
		System.out.println(str2);
	}

	public static void main(String[] args) {
		String s1 = "JAVA IS A LANGUAGE";
		convertUpperToLower(s1);
	}

}
