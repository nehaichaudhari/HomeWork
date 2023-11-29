package com.string.assignment;

import java.util.Scanner;

public class ChangeCaseAllWord {
	static void chengeCase(String str) {
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=97 && ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s1 = sc.next();
		chengeCase(s1);
	}

}
