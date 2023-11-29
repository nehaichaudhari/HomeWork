package com.arraylist.assignment;

import java.util.ArrayList;

public class AddAllElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(56);
		list.add(78);
		list.add(63);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(25);
		list1.add(18);
		list1.add(20);
		
//		list.addAll(list1);
//		System.out.println(list);
		
		list.addAll(2, list1);
		System.out.println(list);
	}

}
