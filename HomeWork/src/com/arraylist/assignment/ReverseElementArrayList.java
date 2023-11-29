package com.arraylist.assignment;

import java.util.ArrayList;

public class ReverseElementArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("pinapple");
		list.add("cherry");
		list.add("orange");
		System.out.println(list);
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--) {
			String temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
		System.out.println(list);
	}

}
