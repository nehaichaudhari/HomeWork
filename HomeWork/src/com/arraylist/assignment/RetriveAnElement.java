package com.arraylist.assignment;

import java.util.ArrayList;

//WAP to retrieve an element (at a specified index) from a given ArrayList
public class RetriveAnElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("radha");
		list.add("ram");
		list.add("seeta");
		list.add("geeta");
		System.out.println(list);
		System.out.println(list.get(2));
	}

}
