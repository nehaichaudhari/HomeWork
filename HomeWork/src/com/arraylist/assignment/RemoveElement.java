package com.arraylist.assignment;

import java.util.ArrayList;

public class RemoveElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("black");
		list.add("blue");
		list.add("white");
		list.add("yellow");
		list.add("green");
		
		System.out.println(list);
		System.out.println(list.remove(2));
	}

}
