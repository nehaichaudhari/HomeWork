package com.string.assignment;

public class RemoveExtraSpacesM {
	public static void main(String[] args) {
		String s = "  I am  sonal  pawar";
		String word = "";
		char ch[] = s.toCharArray();
		String temp = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				temp = temp + ch[i];
			} else {
				if (temp != "") {
					word = word + temp + " ";
					temp = "";
				}
			}
			if (i == ch.length-1) {
				if (temp != "") {
					word = word + temp;
				}
			}
		}
		System.out.println(word);
	}
}