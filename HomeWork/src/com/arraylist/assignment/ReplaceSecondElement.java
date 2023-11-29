package com.arraylist.assignment;

import java.util.ArrayList;

//23.	WAP to replace the second element of an ArrayList with the specified element
public class ReplaceSecondElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("roshan");
		list.add("roshan");
		list.add("kunal");
		list.add("yash");
		System.out.println(list);
		list.set(1, "neha");
		System.out.println(list);
	}
}
