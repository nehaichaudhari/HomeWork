package com.arraylist.assignment;

import java.util.ArrayList;

public class RemoveAllElements {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("c++");
		list.add("java");
		list.add("angular");
		list.add("python");
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
	}

}
