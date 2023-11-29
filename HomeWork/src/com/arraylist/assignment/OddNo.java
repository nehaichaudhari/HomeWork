package com.arraylist.assignment;

import java.util.ArrayList;

public class OddNo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				list.add(i);
			}
		}
		System.out.println(list);

	}

}
