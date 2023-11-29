package com.arraylist.assignment;

import java.util.ArrayList;

public class MatchTwoCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);
		
		boolean flag = true;
		if (list.size() == list1.size()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != list1.get(i)) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println("list are not same");
			}else
				System.out.println("list are same");
		}
	}
}
