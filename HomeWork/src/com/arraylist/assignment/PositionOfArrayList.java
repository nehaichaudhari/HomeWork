package com.arraylist.assignment;

import java.util.ArrayList;

public class PositionOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("c++");
		list.add("angular");
		list.add("java");
		list.add("python");
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println("element: "+list.get(i)+" position: "+i);
		}
		
		System.out.println("java: "+list.indexOf("java"));
	}

}
