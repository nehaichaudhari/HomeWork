package com.arraylist.assignment;

import java.util.ArrayList;

public class RemoveThirdEleAnArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("kunal");
		list1.add("varsha");
		list1.add("sunita");
		list1.add("neha");
		list1.add("roshan");
		System.out.println(list1);
		list1.remove("sunita");
		//list1.remove(2);
		System.out.println(list1);
	}

}
