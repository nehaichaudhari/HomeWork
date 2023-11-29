package com.string.assignment;

public class OccuranceOfEveryChar {
	static void checkOccur(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '\0' || ch[i]==' ') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			System.out.println(ch[i] + " ====> " + count);
		}
	}

	public static void main(String[] args) {
		String s1 = "india is a beautiful country";
		checkOccur(s1);
	}

}
