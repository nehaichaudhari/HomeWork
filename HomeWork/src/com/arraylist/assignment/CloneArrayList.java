package com.arraylist.assignment;

import java.util.ArrayList;

public class CloneArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(35);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			list1.add(list.get(i));
		}
		System.out.println(list1);
	}

}
