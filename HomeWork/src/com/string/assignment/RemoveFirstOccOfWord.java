package com.string.assignment;

public class RemoveFirstOccOfWord {
	static void removeFirstOccOfWord(String str, String word) {
		String strarr[] = str.split("\\s");
		String str1 = "";
		boolean flag = true;
		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i].equals(word) && flag == true) {
				flag = false;
			}else {
				str1 += strarr[i] + " ";
			}
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String s1 = "india is a beautiful country, india is the best";
		removeFirstOccOfWord(s1, "is");
	}
}
