package com.string.assignment;

public class SearchAllOccOfWord {
	static void searchAllOccOfWord(String str, String word) {
		String strarr[]=str.split("\\s");
		for(int i=0;i<strarr.length;i++) {
			if(strarr[i].equals(word)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		String s1= "india is a beautiful country, india is best";
		searchAllOccOfWord(s1, "india");
	}

}
