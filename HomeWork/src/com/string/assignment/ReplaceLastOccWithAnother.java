package com.string.assignment;

public class ReplaceLastOccWithAnother {
	static void replaceLastOcc(String str, char ch, char replaceChar) {
		char charr[] = str.toCharArray();
		boolean flag=true;
		for(int i=charr.length-1;i>0;i--) {
			if(charr[i]==ch && flag==true) {
				charr[i]=replaceChar;
				flag=false;
			}
		}
		//System.out.println(str.replaceFirst("a", "z"));
		System.out.println(charr);
	}
	public static void main(String[] args) {
		String s1 = "india is a country";
		replaceLastOcc(s1, 'a', 'z');
	}

}
