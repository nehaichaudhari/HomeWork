package com.string.assignment;

import java.util.Scanner;
//hello beatiful

public class AlphabeticallySorted {
	static void checkAlphabeticallySorted(String str) {
		String word = "";
		String splitarr[] = str.split("\\s");
		boolean flag = false;
		for (int i = 0; i < splitarr.length; i++) {//hello
			String str1 = splitarr[i];//hello
			flag = true;
			for (int j = 0; j < str1.length() - 1; j++) {//hello
				if (str1.charAt(j) > str1.charAt(j + 1)) {// h > e
					flag = false;
					break;
				}
			}
			if (flag == true) {
				word = str1;
				if (str1.length() > 3) {
					break;
				}
			}
		}
		System.out.println(flag);
		if (word.length()!=0) {
			if (word.length() > 3) {
				System.out.println(word + " : true");
			} else {
				System.out.println(word+" : is sorted but length is less than 3");
			}
		} else
			System.out.println("false");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		checkAlphabeticallySorted(s1);
		sc.close();
	}

}
