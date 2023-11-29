package com.arraylist.assignment;

import java.util.ArrayList;

public class IterateArrayListUsingForEachLoop {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		list.add(15.2d);
		list.add(25.89d);
		list.add(56.5d);
		list.add(11d);
		list.add(63d);
		
		for(Double d:list) {
			System.out.println(d);
		}
	}

}
