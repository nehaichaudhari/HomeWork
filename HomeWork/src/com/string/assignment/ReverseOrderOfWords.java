package com.string.assignment;

public class ReverseOrderOfWords {
	static void reverseWordOrder(String s1) {
		String rev = "";
		String[] split = s1.split("\\s");
		for (int i = split.length - 1; i >= 0; i--) {
			rev += split[i] + " ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		String s1 = "India is a beautiful country";
		System.out.println(s1);
		reverseWordOrder(s1);
	}

}
