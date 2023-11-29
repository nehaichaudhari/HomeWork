package com.predictoutput;

import java.util.LinkedList;
import java.util.List;

public class Output4 {
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<>();
		list1.add("Sun");
		list1.add("Mon");
		list1.add("Tue");
		list1.add("Thu");
		list1.add("Fri");
		List<String> list2 = new LinkedList<>();
		list2.add("Sun");
		list1.retainAll(list2);
		for (String temp : list1)
			System.out.printf(temp + " ");
		System.out.println();
	}
}
