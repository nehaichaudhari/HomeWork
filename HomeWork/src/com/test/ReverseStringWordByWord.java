package com.test;

public class ReverseStringWordByWord {
	static void reverseString(String str) {
		String strarr[]=str.split("\\s");
		String rev="";
		for(int i=0;i<strarr.length;i++) {
			try {
			if(strarr[i].length()<2) 
				throw new InvalidSentanceException("invalid sentance exception");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			for(int j=strarr[i].length()-1;j>=0;j--) {
				rev+=strarr[i].charAt(j);
			}
			rev+=" ";
		}
		System.out.println("reverse string is: "+rev);
	}
	public static void main(String[] args) {
		String s1 = "india is a great nation";
		reverseString(s1);
	}

}
