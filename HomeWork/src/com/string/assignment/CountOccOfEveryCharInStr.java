package com.string.assignment;

public class CountOccOfEveryCharInStr {
	static void countOccOfEveryWord(String str) {
		String splitsarr[] = str.split("\\s");
		int count;
		for (int i = 0; i < splitsarr.length; i++) {
			count = 1;
			if (splitsarr[i].equals(" "))
				continue;
			for (int j = i + 1; j < splitsarr.length; j++) {
				if (splitsarr[i].equals(splitsarr[j])) {
					count++;
					splitsarr[j] = " ";
				}
			}
			System.out.println(splitsarr[i] + " ===> " + count);
		}
	}

	public static void main(String[] args) {
		String s1 = "cat big bad wolf eats a big cat and the cat liked to eat another cat";
		countOccOfEveryWord(s1);
	}

}
