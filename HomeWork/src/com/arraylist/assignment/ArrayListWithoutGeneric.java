package com.arraylist.assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGeneric {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("Radha");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			int data = (int)list.get(i) + 10;// class cast exception and class cast exception
			list.set(i, data);
		}
		System.out.println(list);
	}

}
