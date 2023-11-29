package com.string.assignment;

public class RemoveSpacesCharInString {
	static void removeSpace(String str) {
		//System.out.println(str.trim());
		String s2 = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}else {
				s2=str.substring(i);
				break;
			}
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		String s1 = "   india is a beautiful country";
		removeSpace(s1);
	}

}
