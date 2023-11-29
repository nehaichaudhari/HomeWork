package com.arraylist.assignment;

import java.util.ArrayList;

public class IterateArrayListUsingForLoop {
	public static void main(String[] args) {
		ArrayList<Float> list = new ArrayList<>();
		list.add(15.2f);
		list.add(25.89f);
		list.add(56.5f);
		list.add(11f);
		list.add(63f);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
