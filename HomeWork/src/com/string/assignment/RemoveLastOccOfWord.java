package com.string.assignment;

public class RemoveLastOccOfWord {
	static void removeLastOccOfWord(String str, String word) {
		String splitarr[]=str.split("\\s");
		String str1="";
		boolean flag=true;
		for(int i=0;i<splitarr.length-1;i--) {
			if(splitarr[i].equals(word) && flag==true) {
				flag=false;
			}else
				str1+=splitarr[i]+" ";
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		String s1 = "india is a beautiful country, india is the best";
		removeLastOccOfWord(s1, "is");
	}

}
