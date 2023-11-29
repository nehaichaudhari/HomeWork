package com.arraylist.assignment;

import java.util.ArrayList;

public class ElementsInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		System.out.println(list);
		int count=0;
		for(Integer i: list) {
			count++;
		}
		System.out.println(count);
	}

}
