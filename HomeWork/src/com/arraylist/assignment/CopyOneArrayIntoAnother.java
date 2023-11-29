package com.arraylist.assignment;

import java.util.ArrayList;

public class CopyOneArrayIntoAnother {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("black");
		list.add("white");
		list.add("yellow");
		list.add("green");
		
		ArrayList<String> list1 = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			String s1 = list.get(i);
			list1.add(s1);
		}
		System.out.println(list1);
	}

}
