package com.arraylist.assignment;

import java.util.ArrayList;

public class InsertEleAtSevenPos {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		list.add(6, 28);
		System.out.println(list);
	}

}
