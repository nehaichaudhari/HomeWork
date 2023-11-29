package com.arraylist.assignment;

import java.util.ArrayList;

public class RetainAllElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("black");
		list.add("white");
		list.add("yellow");
		list.add("green");
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("purple");
		list1.add("white");
		list1.add("yellow");
		System.out.println(list1);
		
		System.out.println(list.retainAll(list1));
	}

}
