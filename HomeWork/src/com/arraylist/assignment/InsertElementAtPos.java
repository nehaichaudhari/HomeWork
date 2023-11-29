package com.arraylist.assignment;

import java.util.ArrayList;

//WAP to insert an element into the ArrayList at the first position
public class InsertElementAtPos {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("yellow");
		System.out.println(list);
		list.add(1, "red");
		System.out.println(list);
	}

}
