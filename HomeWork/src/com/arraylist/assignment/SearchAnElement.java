package com.arraylist.assignment;

import java.util.ArrayList;

public class SearchAnElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(18);
		list.add(22);
		list.add(28);
		System.out.println(list);
		int val = 22;
		for(int i=0;i<list.size();i++) {
			if(val==list.get(i)) {
				System.out.println(i);
				break;
			}
		}
	}

}
