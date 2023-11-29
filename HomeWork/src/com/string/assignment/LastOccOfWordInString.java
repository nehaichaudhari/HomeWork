package com.string.assignment;

public class LastOccOfWordInString {
	static void findLastOcc(String str, String word) {
		String splitsarr[]=str.split("\\s");
		for(int i=splitsarr.length-1;i>=0;i--) {
			if(splitsarr[i].equals(word)) {
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String s1 = "india is a country india is a beautiful country";
		findLastOcc(s1, "india");
	}

}
