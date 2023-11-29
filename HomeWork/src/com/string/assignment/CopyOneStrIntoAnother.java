package com.string.assignment;

public class CopyOneStrIntoAnother {
	static void copyString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			str1+=str.charAt(i);
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		String s1 = "java is a language";
		copyString(s1);
	}

}
