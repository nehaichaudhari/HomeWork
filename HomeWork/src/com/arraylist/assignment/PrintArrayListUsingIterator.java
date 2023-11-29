package com.arraylist.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListUsingIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("c++");
		list.add("python");
		list.add("angular");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
