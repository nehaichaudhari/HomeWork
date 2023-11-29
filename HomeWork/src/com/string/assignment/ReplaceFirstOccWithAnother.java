package com.string.assignment;

public class ReplaceFirstOccWithAnother {
	static void replaceFirOcc(String str, char ch, char replaceChar) {
//		String str1="";
//		boolean flag=true;;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==ch && flag==true) {
//				str1+=replaceChar;
//				flag=false;
//			}else {
//				str1+=str.charAt(i);
//			}
//		}
//		System.out.println(str1);
		// 2nd way
		char charr[] = str.toCharArray();
		boolean flag=true;
		for (int i = 0; i < charr.length; i++) {
			if (charr[i] == ch && flag==true) {
				charr[i] = replaceChar;
				flag=false;
			}
		}
		System.out.println(charr);
	}

	public static void main(String[] args) {
		String s1 = "india is a country";
		replaceFirOcc(s1, 'a', 'z');
	}

}
