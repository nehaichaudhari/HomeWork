package com.comparable.assignment;

import java.util.ArrayList;
import java.util.Collections;
//WAP to sort the elements of List that contains String objects.Print ArrayList.
//Sort using Collections.sort(list) method. Print ArrayList.
public class StringArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Orange");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
