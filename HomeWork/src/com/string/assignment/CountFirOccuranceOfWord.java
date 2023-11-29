package com.string.assignment;

public class CountFirOccuranceOfWord {
	static void countFirstOccWord(String str) {
		String splitsarr[]=str.split("\\s");
		String word = splitsarr[0];
		int count=0;
		for(int i=0;i<splitsarr.length;i++) {
			if(word.equals(splitsarr[i])) {
				count++;
			}
		}
		System.out.println(word+" ===> "+count);
	}
	public static void main(String[] args) {
		String s1 = "cat big bad wolf eats a big cat and the cat liked to eat another cat";
		countFirstOccWord(s1);
	}

}
