package com.string.assignment;

public class RemoveOccurOfChar {
	static void removeAllOccurences(String s1) {
		s1 = s1.replaceAll("l", "*");
		System.out.println("After replace: " + s1);
	}

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println("S1 : " + s1);
		removeAllOccurences(s1);
	}

}
