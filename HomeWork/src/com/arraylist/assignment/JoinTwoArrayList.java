package com.arraylist.assignment;

import java.util.ArrayList;

public class JoinTwoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(25);
		list.add(65);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(35);
		list1.add(11);
		list1.add(65);
		
		for(int i = 0; i < list1.size(); i++) {
			list.add(list1.get(i));
		}
		System.out.println(list);
	}

}
