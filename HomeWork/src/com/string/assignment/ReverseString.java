package com.string.assignment;

public class ReverseString {
	static void reverseString(String s1) {
		//for single word
//		String rev = "";
//		for (int i = s1.length() - 1; i >= 0; i--) {
//			rev += s1.charAt(i);
//		}
//		System.out.println("Reverse : " + rev);
		
		//for sentance
		String rev = "";
		String starr[]= s1.split("\\s");
		for(int i=0;i<starr.length;i++) {
			String str1 = starr[i];
			for(int j=str1.length()-1;j>=0;j--) {
				rev+=str1.charAt(j);
			}
			rev+=" ";
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		String s1 = "One two three four";
		System.out.println("s1 : " + s1);
		reverseString(s1);
	}

}
