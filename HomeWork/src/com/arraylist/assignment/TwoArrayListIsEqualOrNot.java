package com.arraylist.assignment;

import java.util.ArrayList;

public class TwoArrayListIsEqualOrNot {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(25);
		list.add(65);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(35);
		list1.add(11);
		list1.add(65);

		boolean flag = false;
		if (list.size() == list1.size()) {
			for (int i = 0; i < list.size(); i++) {
				flag = false;
				for (int j = 0; j < list1.size(); j++) {
					if (list.get(i) == list1.get(j)) {
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("lists are not equal");
					break;
				}
			}
		}
		if (flag) {
			System.out.println("lists are equal");
		}
	}

}
