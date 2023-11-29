package com.arraylist.assignment;

import java.util.ArrayList;

public class EmptyAnArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(16);
		list.add(55);
		list.add(32);
		list.add(63);
		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		System.out.println(list);
	}

}
