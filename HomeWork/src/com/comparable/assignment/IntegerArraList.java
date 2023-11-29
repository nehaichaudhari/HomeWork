package com.comparable.assignment;

import java.util.ArrayList;
import java.util.Collections;
//WAP to sort the elements of List that contains Integer objects.
//Print ArrayList.Sort using Collections.sort(list) method.Print ArrayList.
public class IntegerArraList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add(2);
		list.add(10);
		list.add(23);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
