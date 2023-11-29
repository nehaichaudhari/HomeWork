package com.string.assignment;

public class ConcatinateString {
	static void concateStr(String str1, String str2) {
		char ch[] = str1.toCharArray();
		char ch1[]=str2.toCharArray();
		char ch2[]=new char[str1.length()+str2.length()];
		int index=0;
		for(int i=0;i<ch.length;i++) {
			ch2[index]=ch[i];
			index++;
		}
		for(int i=0;i<ch1.length;i++) {
			ch2[index]=ch1[i];
			index++;
		}
		System.out.println(ch2);
	}
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "language";
		concateStr(s1, s2);
	}

}
