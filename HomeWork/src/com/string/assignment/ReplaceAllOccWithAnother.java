package com.string.assignment;

public class ReplaceAllOccWithAnother {
	static void replaceAllOcc(String str, char ch, char replaceChar) {
		char charr[]=str.toCharArray();
		for(int i=0;i<charr.length;i++) {
			if(charr[i]==ch) {
				charr[i]=replaceChar;
			}
		}
		System.out.println(charr);
	}
	public static void main(String[] args) {
		String s1 = "india is a country";
		replaceAllOcc(s1, 'i', 'z');
	}

}
