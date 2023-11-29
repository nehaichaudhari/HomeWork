package com.string.assignment;

import java.util.Scanner;

public class ReplaceVowels {
	static void replVowels(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c = ch[i];
			if(c=='a' || c=='e' || c=='i' || c=='i' || c=='u' ) {
				ch[i]='$';
			}
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s1 = sc.next();
		replVowels(s1);
	}

}
